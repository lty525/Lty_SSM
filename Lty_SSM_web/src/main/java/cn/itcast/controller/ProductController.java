package cn.itcast.controller;

import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 10:46$
 * @Version: 1.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
 /*   @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> products = productService.findAll();
        mv.addObject("productList",products);
        mv.setViewName("product-list");
        System.out.println("我是");
        return mv;

    }*/

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("/findAll")
    @RolesAllowed("ADMIN")
    public ModelAndView findAll(@RequestParam(name = "page" ,required = true ,defaultValue  = "1") Integer page,@RequestParam(name = "size" ,required = true ,defaultValue = "4")  Integer size){
        ModelAndView mv = new ModelAndView();
        List<Product> products = productService.findAll(page,size);
        PageInfo pageInfoP = new PageInfo(products);
        mv.addObject("pageInfos",pageInfoP);
        mv.setViewName("product-list");

        return mv;

    }
    @RequestMapping("/save")
    public String save(Product product){
        System.out.println(product);
        productService.save(product);
        return "redirect:findAll";
    }

    /**
     * 批量删除
     * @param
     * @return
     */
    @RequestMapping("/deleteIds")
    public String deleteIds(String[] ids){

       productService.delete(ids);
        return "redirect:findAll";
    }
}
