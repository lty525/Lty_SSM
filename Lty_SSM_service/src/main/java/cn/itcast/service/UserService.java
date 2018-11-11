package cn.itcast.service;

import cn.itcast.domain.Role;
import cn.itcast.domain.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/8$ 16:27$
 * @Version: 1.0
 */
public interface UserService  extends UserDetailsService {
    /**
     * 查询所有
     * @return
     */
    List<Users> findAll(int page,int size)throws Exception;

    /**
     * 添加用户
     * @param users
     */
    void save(Users users) throws Exception;

    /**
     * 根据用户id查找
     * @param usersId
     * @return
     */

    Users findById(String usersId)throws Exception;

    List<Role> findOthersRole(String id)throws Exception;

    void addRoleToUser(String[] roleIds, String userId) throws Exception;

    void deleteRole(String roleId, String userId)throws Exception;

    void deleteUsers(String id)throws Exception;

    void updatepassword(String[] ids) throws Exception;

    Users findByUsername(String username)throws Exception;

    void updateUsers(Users users) throws Exception;

    Users findByIdAndPd(String id,String password);

    void updatePd(String password, String id);
}
