package cn.itcast.service;

import cn.itcast.domain.Syslog;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/10$ 11:09$
 * @Version: 1.0
 */
//日志Service层
public interface SyslogService {
  void   save(Syslog syslog);

    List<Syslog> findAll(int page,int size) throws Exception;

  void deleteIds(String[] ids);
}
