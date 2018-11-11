package cn.itcast.controller;

import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;
import cn.itcast.service.RoleService;
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
 * @CreateDate: 2018/11/9$ 9:32$
 * @Version: 1.0
 */
//角色的web层
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 给角添加权限
     * @param
     * @param permIds
     * @return
     */
    @RequestMapping("/addPermToRole")
    public  String addPermToRole(String id,@RequestParam(name = "ids",required = true) String[] permIds)throws Exception{
        roleService.addPermToRole(id,permIds);
        return "redirect:findAll";
    }
    //查询角色可以添加的权限
    @RequestMapping("/findRoleByIdAndOtherPerm")
    public ModelAndView findRoleByIdAndOtherPerm(@RequestParam(name = "id" ,required = true) String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        //根据角色id来查询角色
        Role role = roleService.findById(id);
        //根据角色的id来查询角色可以添加的权限
        List<Permission> permissions = roleService.findOtherPerm(role.getId());
        mv.addObject("PermissionList", permissions);
        mv.addObject("roles", role);
        mv.setViewName("role-permission-add");
        return mv;
    }
    @RequestMapping("/findAll")
    //分页查询所有
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Role> roles = roleService.findAll(page, size);
        //PageHepler中的PageInfo分页类
        PageInfo pageInfos = new PageInfo(roles);
        mv.addObject("pageInfos", pageInfos);
        mv.setViewName("role-list");
        return mv;
    }

    /**
     * 保存操作
     *
     * @param role
     * @return
     */
    @RequestMapping("/save")
    public String save(Role role) throws Exception {
        roleService.save(role);
        return "redirect:findAll";
    }
    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String roleId) throws Exception {
        ModelAndView mv = new ModelAndView();
        Role role = roleService.findById(roleId);
        mv.addObject("role", role);
        mv.setViewName("role-show");
        return mv;
    }
    //移除权限
    @RequestMapping("/deletePerm")
    public String deletePerm(String roleId,String permId)throws Exception{
        roleService.deletePerm(roleId,permId);
        return "redirect:findById?id="+roleId;
    }

    /**
     * 删除角色
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteRole")
    public String deleteRole(String id)throws Exception{
        roleService.deleteRole(id);
        return "redirect:findAll";
    }
}
