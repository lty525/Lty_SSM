package cn.itcast.service.impl;

import cn.itcast.dao.PermissionMapper;
import cn.itcast.domain.Permission;
import cn.itcast.service.PermissionService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/9$ 10:01$
 * @Version: 1.0
 */
@Service

public class PermissionServiceImpl  implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    /**
     * 查询所有角色
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Permission> findAll(int page , int size) throws Exception {
        PageHelper.startPage(page,size);
        return permissionMapper.selectByExample(null);
    }

    /**
     * 保存权限
     *
     * @param permission
     * @throws Exception
     */
    @Override
    public void save(Permission permission) throws Exception {
        permissionMapper.insertSelective(permission);
    }

    @Override
    public void deleteperm(String id) {
        //先删除权限表和角色表的关系
        permissionMapper.deletePermRole(id);
        //删除权限表的数据
        permissionMapper.deleteByPrimaryKey(id);
    }
}
