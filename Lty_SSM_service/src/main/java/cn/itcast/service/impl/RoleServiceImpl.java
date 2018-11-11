package cn.itcast.service.impl;

import cn.itcast.dao.RoleMapper;
import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;
import cn.itcast.service.RoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/9$ 9:34$
 * @Version: 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询所有角色
     *
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @Override
    public List<Role> findAll(int page, int size) throws Exception {
        PageHelper.startPage(page,size);
        return roleMapper.selectByExample(null);
    }

    /**
     * 保存操作
     *
     * @param role
     */
    @Override
    public void save(Role role) throws Exception{
        roleMapper.insertSelective(role);
    }

    /**
     * 根据id来查询角色信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Role findById(String id) throws Exception {
        return  roleMapper.findById(id);
    }

    /**
     * 根据id来查询角色可以添加的权限
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public List<Permission> findOtherPerm(String id) throws Exception {
        return roleMapper.findOtherPerm(id);
    }

    /**
     * 给角色添加可以添加的权限
     * @param roleId
     * @param permIds
     * @throws Exception
     */
    @Override
    public void addPermToRole(String roleId, String[] permIds) throws Exception {
        for (String permId : permIds) {
            roleMapper.addPermToRole(permId,roleId);
        }
    }

    /**
     * 移除权限
     * @param roleId
     * @param permId
     */
    @Override
    public void deletePerm(String roleId, String permId) {
        roleMapper.deletePerm(roleId,permId);
    }

    /**
     * 根据id删除角色
     * @param id
     * @throws Exception
     */
    @Override
    public void deleteRole(String id) throws Exception {
        //先删除角色和用户相关的表
        roleMapper.deleteUserRole(id);
        //在删除和权限的外表
        roleMapper.deleteRolePerm(id);
        //在删除role表中的数据
        roleMapper.deleteByPrimaryKey(id);
    }
}
