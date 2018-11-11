package cn.itcast.dao;

import cn.itcast.domain.Role;
import cn.itcast.domain.Users;
import cn.itcast.domain.UsersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    Users findByUsername(String username) throws Exception;

    /**
     * 新增 通过用户id来查找
     * @param usersId
     * @return
     */
    Users findById(String usersId);

    /**
     * 新增,根据id来查询该用户可以添加的角色
     * @param id
     * @return
     */
    List<Role> findOthersRole(String id);


    /**
     * 给中间表添加数据
     * @param roleId
     * @param userId
     */
    void addRoleToUser(@Param("userId") String userId,@Param("roleId") String roleId);

    /**
     * 新增 删除用户的角色
     * @param roleId
     * @param userId
     */

    void deleteRole(@Param("roleId") String roleId, @Param("userId") String userId);

    void deleteUsersRole(String id);

    /**
     * 根据用户名来重置密码
     * @param id
     */
    void updatepassword(String id);

    /**
     * 根据id和密码查询
     * @param id
     * @param password
     */
    void findUserByIdAndPd(@Param("id") String id, @Param("pwd") String password);
}