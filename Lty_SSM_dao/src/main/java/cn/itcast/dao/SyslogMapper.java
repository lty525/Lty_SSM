package cn.itcast.dao;

import cn.itcast.domain.Syslog;
import cn.itcast.domain.SyslogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyslogMapper {
    long countByExample(SyslogExample example);

    int deleteByExample(SyslogExample example);

    int deleteByPrimaryKey(String id);

    int insert(Syslog record);

    int insertSelective(Syslog record);

    List<Syslog> selectByExample(SyslogExample example);

    Syslog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExample(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByPrimaryKeySelective(Syslog record);

    int updateByPrimaryKey(Syslog record);
}