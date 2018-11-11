package cn.itcast.controller;

import cn.itcast.domain.Permission;
import cn.itcast.service.PermissionService;
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
 * @CreateDate: 2018/11/9$ 10:00$
 * @Version: 1.0
 */
@RequestMapping("/perm")
@Controller
public class PermissionController {
    @Autowired
    private PermissionService perm;
    @RequestMapping("/findAll")
    //分页查询所有
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Permission> perms = perm.findAll(page, size);
        //PageHepler中的PageInfo分页类
        PageInfo pageInfos = new PageInfo(perms);
        mv.addObject("pageInfos", pageInfos);
        mv.setViewName("permission");
        return mv;

    }
    @RequestMapping("/save")
    public String save(Permission permission) throws Exception {
        perm.save(permission);
        return "redirect:findAll";
    }

    /**
     * 删除权限
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteperm")
    public String deleteperm(String id) throws Exception {
        perm.deleteperm(id);
        return "redirect:findAll";
    }

}
