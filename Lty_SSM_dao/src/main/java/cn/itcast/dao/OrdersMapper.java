package cn.itcast.dao;

import cn.itcast.domain.Orders;
import cn.itcast.domain.OrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    /**
     * 查询全部
     * @return
     */
    List<Orders> findAll();
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 自己加的 根据id来查找订单详情
     * @param ordersId
     * @return
     */
    Orders findById(String ordersId);

    //删除订单和旅游的关系
    void deleteOrdersTravel(String id);
}