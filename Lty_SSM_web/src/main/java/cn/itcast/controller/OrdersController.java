package cn.itcast.controller;


import cn.itcast.domain.Orders;
import cn.itcast.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 19:02$
 * @Version: 1.0
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * 查询所有订单 ---未分页
     *
     * @return
     */
   /* @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Orders> orders = ordersService.findAll();
        mv.addObject("ordersList",orders);
        mv.setViewName("orders-list");
        return mv;

    }*/
    @RequestMapping("/findAll")
    @Secured("ROLE_ADMIN")
    //存入两个参数
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        ModelAndView mv = new ModelAndView();
        List<Orders> orders = ordersService.findAll(page, size);
        //PageHepler中的PageInfo分页类
        PageInfo pageInfos = new PageInfo(orders);
        mv.addObject("pageInfos", pageInfos);
        mv.setViewName("orders-page-list");
        return mv;

    }

    /**
     * 批量删除
     *
     * @param
     * @return
     */
    @RequestMapping("/deleteIds")
    public String deleteIds(String[] ids) {

        ordersService.delete(ids);
        return "redirect:findAll";
    }

    /**
     * 根据id来查订单详细
     *
     * @param
     * @return
     */
    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String ordersId)throws Exception {

        ModelAndView mv = new ModelAndView();
        Orders orders = ordersService.findById(ordersId);
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");

        return mv;
    }

}
