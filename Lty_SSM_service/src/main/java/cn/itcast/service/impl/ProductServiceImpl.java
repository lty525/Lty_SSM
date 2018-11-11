package cn.itcast.service.impl;

import cn.itcast.dao.ProductMapper;
import cn.itcast.domain.Product;
import cn.itcast.domain.ProductExample;
import cn.itcast.service.ProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 9:51$
 * @Version: 1.0
 */
@Service

public class ProductServiceImpl  implements ProductService {
    /**
     * 查询所有产品
     *
     * @return
     */
    @Autowired
    private ProductMapper  productMapper;
    @Override
    public List<Product> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return productMapper.selectByExample(null);
    }

    /**
     * 保存操作
     *
     * @param product
     */
    @Override
    public void save(Product product) {
       int i= productMapper.insertSelective(product);
    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void delete(String[] ids) {
        if (ids!=null&&ids.length>0) {
            ProductExample example = new ProductExample();
            ProductExample.Criteria criteria = example.createCriteria();
            ProductExample.Criteria criteria1 = criteria.andIdIn(Arrays.asList(ids));
            int i = productMapper.deleteByExample(example);
        }
    }
}
