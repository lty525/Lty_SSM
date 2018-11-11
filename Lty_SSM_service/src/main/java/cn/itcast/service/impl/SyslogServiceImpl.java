package cn.itcast.service.impl;

import cn.itcast.dao.SyslogMapper;
import cn.itcast.domain.Syslog;
import cn.itcast.domain.SyslogExample;
import cn.itcast.service.SyslogService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/10$ 11:10$
 * @Version: 1.0
 */
@Service
public class SyslogServiceImpl  implements SyslogService {
    @Autowired
    private SyslogMapper syslogMapper;
    /**
     * 保存方法
     * @param syslog
     */
    @Override
    public void save(Syslog syslog) {
        syslogMapper.insertSelective(syslog);
    }

    @Override
    public List<Syslog> findAll(int page, int size) throws Exception {
        PageHelper.startPage(page,size);
        return syslogMapper.selectByExample(null);
    }

    @Override
    public void deleteIds(String[] ids) {
        if (ids!=null){
            SyslogExample example= new SyslogExample();
            SyslogExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(Arrays.asList(ids));
            syslogMapper.deleteByExample(example);
        }
    }
}
