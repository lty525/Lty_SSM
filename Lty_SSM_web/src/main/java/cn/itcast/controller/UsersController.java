package cn.itcast.controller;

import cn.itcast.domain.ErroInfo;
import cn.itcast.domain.Role;
import cn.itcast.domain.Users;
import cn.itcast.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/8$ 21:10$
 * @Version: 1.0
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;


    //移除角色
    @RequestMapping("/deleteRole")
    public String deleteRole(String roleId,String userId)throws Exception{
        userService.deleteRole(roleId,userId);
        return "redirect:findById?id="+userId;
    }

    //给用户添加角色
    @RequestMapping("/addRoleToUser")
    public String addRoleToUser(@RequestParam(name="ids" ,required = true) String[] roleIds,String userId) throws Exception {
        userService.addRoleToUser(roleIds,userId);
        return "redirect:findAll";
    }
    //查询当前用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole")
    public ModelAndView findUserByIdAndAllRole(String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        //根据id查询用户
        Users users = userService.findById(id);
        //根据id来查询可以添加的角色
        List<Role> roles = userService.findOthersRole(id);
        mv.addObject("roleList", roles);
        mv.addObject("user",users);
        mv.setViewName("user-role-add");

        return mv;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Users> users = userService.findAll(page, size);
        PageInfo pageInfos = new PageInfo(users);
        mv.addObject("pageInfos", pageInfos);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String usersId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Users users = userService.findById(usersId);
        mv.addObject("user", users);
        mv.setViewName("user-show");
        return mv;
    }

    /**查询用户来回显数据 --管理员修改
     * @param usersId
     * @return
     * @throws Exception
     */
    @RequestMapping("/findByIdtoupdate")
    public ModelAndView findByIdtoupdate(@RequestParam(name = "id", required = true) String usersId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Users users = userService.findById(usersId);
        mv.addObject("user", users);
        mv.setViewName("userAdmin-update");
        return mv;
    }

    /**
     * 添加功能
     *
     * @param users
     * @return
     */
    @RequestMapping("/save")
    public String save(Users users) throws Exception {
        userService.save(users);
        return "redirect:findAll";
    }

    /**
     * 移除用户
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteUsers")
    public String deleteUsers(String id) throws Exception {
        userService.deleteUsers(id);
        return "redirect:findAll";
    }
    /**
     * 重置用户密码
     */
    @RequestMapping("/updatepassword")
    public String updatepassword(String[] ids) throws Exception{
        userService.updatepassword(ids);

        return "redirect:findAll";
    }

    /**
     * 根据用户名来修改个人信息--普通用户修改
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/findByUsername")
    public ModelAndView findByUsername(String username) throws Exception {
        System.out.println(username);
        Users users = userService.findByUsername(username);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",users);
        mv.setViewName("user-update");
        return mv;
    }
    @RequestMapping("/findByUsernametoUpdate")
    public ModelAndView findByUsernametoUpdate(String username) throws Exception {
        System.out.println(username);
        Users users = userService.findByUsername(username);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",users);
        mv.setViewName("user-updatePassword");
        return mv;
    }

  @RequestMapping("/AdminupdateUsers")
    public  String AdminupdateUsers(Users users) throws Exception{
        userService.updateUsers(users);
        return "redirect:findAll";
  }
    @RequestMapping("/updateUsers")
    public  String updateUsers(Users users) throws Exception{
        userService.updateUsers(users);
        return "main";
    }

    /**
     * 根据id和密码进行查询 异步请求
     * @param id
     * @param password
     * @return
     * @throws Exception
     */
    @RequestMapping("/findByPasswordAndId")
    public @ResponseBody  ErroInfo findByPasswordAndId( String id ,String password) throws Exception{
        ErroInfo erroInfo = new ErroInfo();
        Users users1 =  userService.findByIdAndPd(id,password);
       if (users1==null){
           erroInfo.setFlags(false);
           erroInfo.setErrmsg("*  密码错误");
       }
       else{
           erroInfo.setFlags(true);
           erroInfo.setErrmsg("√密码正确");
       }

        return erroInfo;
    }
    @RequestMapping("/updatePd")
    public String updatePd(String password,String id ) throws ServletException, IOException {
        userService.updatePd(password,id);

        return "redirect:logout";
//       request.getRequestDispatcher(request.getContextPath()+"/logout").forward(request,res);

    }
}
