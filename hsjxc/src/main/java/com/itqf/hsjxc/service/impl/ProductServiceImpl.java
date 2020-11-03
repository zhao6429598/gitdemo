package com.itqf.hsjxc.service.impl;

import com.itqf.hsjxc.bean.Product;
import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.mapper.ProductMapper;
import com.itqf.hsjxc.service.ProductService;
import com.itqf.hsjxc.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 17:08
 * description:
 */

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Result findAll() {

        List<Product> products = productMapper.queryAll();

        Result result = new Result();
        if (products != null && products.size() >0)
        {
            result.setCode(Constants.OK);
            result.setData(products);

        }else{

            result.setCode(Constants.FAIL);
        }

        return result;
    }
}
