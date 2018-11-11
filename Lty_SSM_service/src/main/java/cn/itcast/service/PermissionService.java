package cn.itcast.service;

import cn.itcast.domain.Permission;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/9$ 10:01$
 * @Version: 1.0
 */
public interface PermissionService {
    /**
     * 查询所有权限
     * @return
     * @throws Exception
     */
    List<Permission> findAll(int page ,int size) throws Exception;

    /**
     * 保存权限
     * @param permission
     * @throws Exception
     */
    void save(Permission permission)throws Exception;

    void deleteperm(String id);
}
