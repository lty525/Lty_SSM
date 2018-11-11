package cn.itcast.dao;

import cn.itcast.domain.Permission;
import cn.itcast.domain.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 新增 根据角色id来查询Permission表中的数据
     * @return
     */
    List<Permission> findRoleId(String roleId);

    /**
     * 删除角色和权限的关系
     * @param id
     */
    void deletePermRole(String id);
}