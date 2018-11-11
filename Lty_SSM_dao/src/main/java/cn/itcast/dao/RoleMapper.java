package cn.itcast.dao;

import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;
import cn.itcast.domain.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    /**
     * 新增 根据usersId来查找role表中的数据
     * @param
     * @return
     */
    List<Role> findUsersId(String usersId);

    /**
     * 新增根据 角色id来查询角色可以添加的权限
     * @param id
     * @return
     */
    List<Permission> findOtherPerm(String id);

    /**
     * 给角色添加权限
     * @param permId
     * @param roleId
     */
    void addPermToRole(@Param("permId") String permId, @Param("roleId") String roleId);

    /**
     * 根据id来查询Role的信息
     * @param id
     * @return
     */
    Role findById(String id);

    /**
     * 删除角色中的权限
     * @param roleId
     * @param permId
     */
    void deletePerm(@Param("roleId") String roleId, @Param("permId") String permId);

    /**
     * 删除和角色用户的外表
     * @param id
     */
    void deleteUserRole(String id);

    /**
     * 删除和权限的外表
     * @param id
     */
    void deleteRolePerm(String id);
}