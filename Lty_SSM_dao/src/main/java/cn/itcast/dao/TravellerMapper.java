package cn.itcast.dao;

import cn.itcast.domain.Traveller;
import cn.itcast.domain.TravellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravellerMapper {
    long countByExample(TravellerExample example);

    int deleteByExample(TravellerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Traveller record);

    int insertSelective(Traveller record);

    List<Traveller> selectByExample(TravellerExample example);

    Traveller selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Traveller record, @Param("example") TravellerExample example);

    int updateByExample(@Param("record") Traveller record, @Param("example") TravellerExample example);

    int updateByPrimaryKeySelective(Traveller record);

    int updateByPrimaryKey(Traveller record);

    /**
     * 新增 根据ordersId来查找Traveller表中的数据
     * @param ordersId
     * @return
     */
    List<Traveller> findByOrdersId(String ordersId);
}