package cn.itcast.service.impl;

import cn.itcast.dao.UsersMapper;
import cn.itcast.domain.Role;
import cn.itcast.domain.Users;
import cn.itcast.domain.UsersExample;
import cn.itcast.service.UserService;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/8$ 16:28$
 * @Version: 1.0
 */
@Service("userService")
public  class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper ;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查询
        Users users=null;
        try {
           users = usersMapper.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //spring security的中User对象 有多个参数
        User user = new User(users.getUsername(),users.getPassword(),users.getStatus()==1?true:false,true,true,
                true,getAuthority(users.getRoles()));
        return user;
    }

    //模拟角色的获取
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRolename()));
        }
        return list;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Users> findAll(int page,int size) throws Exception{


        PageHelper.startPage(page,size);
        return usersMapper.selectByExample(null);
    }

    /**
     * 添加用户
     *
     * @param users
     */
    @Override
    public void save(Users users) throws Exception{

        //密码加密 spring security提供了加密类BCryptPasswordEncoder
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        System.out.println(users.getPassword());
        int i = usersMapper.insertSelective(users);
    }

    /**
     * 根据用户id查找
     *
     * @param usersId
     * @return
     */
    @Override
    public Users findById(String usersId) throws Exception{
        return usersMapper.findById(usersId);
    }

    /**
     * 查询该用户可以添加的角色
     * @param id
     * @return
     */
    @Override
    public List<Role> findOthersRole(String id)throws Exception {
        return usersMapper.findOthersRole(id);
    }

    /**
     * 给用户添加多个角色
     * @param roleIds
     * @param userId
     */
    @Override
    public void addRoleToUser(String[] roleIds, String userId)throws Exception {

        for (String roleId : roleIds) {
            usersMapper.addRoleToUser(userId,roleId);
        }

    }

    /**
     * 删除用户的角色
     * @param roleId
     * @param userId
     */
    @Override
    public void deleteRole(String roleId, String userId)throws Exception {
        usersMapper.deleteRole(roleId,userId);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void deleteUsers(String id) throws Exception{
        //先删除用户和角色表的外表
        usersMapper.deleteUsersRole(id);
        //删除用户表的信息
        usersMapper.deleteByPrimaryKey(id);
    }

    /**
     * 重置密码
     * @param ids
     */
    @Override
    public void updatepassword(String[] ids) throws Exception {
      if (ids!=null){
          for (String id : ids) {
              //根据id来修改密码
              usersMapper.updatepassword(id);
          }
      }
    }

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    @Override
    public Users findByUsername(String username) throws Exception {

        return usersMapper.findByUsername(username);
    }

    /**
     *修改用户
     * @param users
     */
    @Override
    public void updateUsers(Users users) throws Exception{
        usersMapper.updateByPrimaryKey(users);
    }

    @Override
    public Users findByIdAndPd(String id,String password) {
        Users userOld = usersMapper.findById(id);
        boolean flag = bCryptPasswordEncoder.matches(password, userOld.getPassword());
      if (flag){
          return userOld;
      }

        return null;
    }

    /**
     * 修改密码
     * @param password
     * @param id
     */
    @Override
    public void updatePd(String password, String id) {
        Users users = usersMapper.findById(id);
        users.setPassword(bCryptPasswordEncoder.encode(password));
        usersMapper.updateByPrimaryKeySelective(users);
    }
}

