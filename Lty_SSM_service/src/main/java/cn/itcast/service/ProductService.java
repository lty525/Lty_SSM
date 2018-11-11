package cn.itcast.service;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 9:49$
 * @Version: 1.0
 */

import cn.itcast.domain.Product;

import java.util.List;

/**
 * Service层
 */
public interface ProductService {

    /**
     * 查询所有
     * @return
     */
    List<Product> findAll(int page,int size);

    /**
     * 保存操作
     * @param product
     */
    void save(Product product);

    /**
     * 批量删除
     * @param ids
     */

    void delete(String[] ids);
}
