package cn.itcast.dao;

        import cn.itcast.domain.OrderTravellerExample;
        import cn.itcast.domain.OrderTravellerKey;
        import org.apache.ibatis.annotations.Param;

        import java.util.List;

public interface OrderTravellerMapper {
    long countByExample(OrderTravellerExample example);

    int deleteByExample(OrderTravellerExample example);

    int deleteByPrimaryKey(OrderTravellerKey key);

    int insert(OrderTravellerKey record);

    int insertSelective(OrderTravellerKey record);

    List<OrderTravellerKey> selectByExample(OrderTravellerExample example);

    int updateByExampleSelective(@Param("record") OrderTravellerKey record, @Param("example") OrderTravellerExample example);

    int updateByExample(@Param("record") OrderTravellerKey record, @Param("example") OrderTravellerExample example);
}