package cn.itcast.controllerUntils;

import cn.itcast.domain.Syslog;
import cn.itcast.service.SyslogService;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/10$ 18:52$
 * @Version: 1.0
 */

public class LogAopFilter implements HandlerInterceptor {

    @Autowired
    private SyslogService sysLogService;

    public JoinPoint returnJp(JoinPoint joinPoint){
        return joinPoint;
    }

    private Date visitTime; //开始时间
    private Class clazz; //访问的类
    private Method method;//访问的方法
    //拦截之前执行的
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler ,JoinPoint jp  ) throws NoSuchMethodException {

        visitTime = new Date();//当前时间就是开始访问的时间
        clazz = jp.getTarget().getClass(); //具体要访问的类
        String methodName = jp.getSignature().getName(); //获取访问的方法的名称
        Object[] args = jp.getArgs();//获取访问的方法的参数

        //获取具体执行的方法的Method对象
        if (args == null || args.length == 0) {
            method = clazz.getMethod(methodName); //只能获取无参数的方法
        } else {
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                classArgs[i] = args[i].getClass();
            }
            clazz.getMethod(methodName, classArgs);
        }
        return true;
    }
    //拦截之后执行的方法

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        long time = new Date().getTime() - visitTime.getTime(); //获取访问的时长

        String url = "";
        //获取url
        if (clazz != null && method != null && clazz != LogAop.class) {
            //1.获取类上的@RequestMapping("/orders")
            RequestMapping classAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (classAnnotation != null) {
                String[] classValue = classAnnotation.value();
                //2.获取方法上的@RequestMapping(xxx)
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if (methodAnnotation != null) {
                    String[] methodValue = methodAnnotation.value();
                    url = classValue[0] + methodValue[0];

                    //获取访问的ip
                    String ip = request.getRemoteAddr();

                    //获取当前操作的用户
                    SecurityContext context = SecurityContextHolder.getContext();//从上下文中获了当前登录的用户
                    User user = (User) context.getAuthentication().getPrincipal();
                    String username = user.getUsername();

                    //将日志相关信息封装到SysLog对象
                    Syslog sysLog = new Syslog();
                    sysLog.setExecutiontime(time); //执行时长
                    sysLog.setIp(ip);
                    sysLog.setMethod("类名: " + clazz.getName() + "方法名: " + method.getName());
                    sysLog.setUrl(url);
                    sysLog.setUsername(username);
                    sysLog.setVisittime(visitTime);

                    //调用Service完成操作
                    sysLogService.save(sysLog);
                }
            }
        }
    }
}
