package cn.itcast.service;

import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/9$ 9:34$
 * @Version: 1.0
 */
public interface RoleService {
    /**
     * 查询所有角色
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    List<Role> findAll(int page, int size) throws Exception;

    /**
     * 保存操作
     * @param role
     */
    void save(Role role)throws Exception;

    Role findById(String id)throws Exception;

    List<Permission> findOtherPerm(String id) throws Exception;

    void addPermToRole(String roleId, String[] permIds) throws Exception;

    void deletePerm(String roleId, String permId)throws Exception;

    void deleteRole(String id)throws Exception;
}
