package cn.itcast.service;

import cn.itcast.domain.Orders;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 19:05$
 * @Version: 1.0
 */
public interface OrdersService {
    /**
     * 查询所有订单
     * @return
     */
    List<Orders> findAll(int page,int size);

    /**
     * 批量删除
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 根据id来查找订单详情
     * @param ordersId
     * @return
     */

    Orders findById(String ordersId)throws Exception;
}
