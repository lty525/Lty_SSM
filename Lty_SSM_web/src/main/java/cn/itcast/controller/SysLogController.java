package cn.itcast.controller;

import cn.itcast.domain.Syslog;
import cn.itcast.service.SyslogService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/10$ 14:17$
 * @Version: 1.0
 */

@Controller
@RequestMapping("/sysLog")
public class SysLogController {
    @Autowired
    private SyslogService syslogService;
    //查询日志
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Syslog> syslogs = syslogService.findAll(page,size);
        PageInfo pageInfos = new PageInfo(syslogs);
        mv.addObject("pageInfos",pageInfos);
        mv.setViewName("syslog-list");
        return mv;
    }
    /**
     * 批量删除
     * @param
     * @return
     */
    @RequestMapping("/deleteIds")
    public String deleteIds(String[] ids){

    syslogService.deleteIds(ids);
        return "redirect:findAll";
    }

}
