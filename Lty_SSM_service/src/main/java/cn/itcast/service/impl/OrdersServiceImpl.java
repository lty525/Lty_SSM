package cn.itcast.service.impl;

import cn.itcast.dao.OrdersMapper;
import cn.itcast.domain.Orders;
import cn.itcast.domain.OrdersExample;
import cn.itcast.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 19:05$
 * @Version: 1.0
 */
@Service
public class OrdersServiceImpl  implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    /**
     * 查询所有订单
     *
     * @return
     */
    @Override
    public List<Orders> findAll(int page,int size) {
        //分页 写在查询之前 pageNum 当前页码,pageSize
        PageHelper.startPage(page,size);
        return ordersMapper.findAll();
    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void delete(String[] ids) {
        if (ids!=null&&ids.length>0) {
            //先删除订单和旅游表的关系
            for (String id : ids) {
                ordersMapper.deleteOrdersTravel(id);
            }
            OrdersExample example = new OrdersExample();
            OrdersExample.Criteria criteria = example.createCriteria();
            OrdersExample.Criteria criteria1 = criteria.andIdIn(Arrays.asList(ids));
            int i = ordersMapper.deleteByExample(example);
        }
    }

    /**
     * 根据id来查找订单详情
     *
     * @param ordersId
     * @return
     */
    @Override
    public Orders findById(String ordersId)throws Exception {

        return ordersMapper.findById(ordersId);
    }
}
