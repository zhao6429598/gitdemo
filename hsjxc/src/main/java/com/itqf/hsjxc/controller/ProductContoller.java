package com.itqf.hsjxc.controller;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 17:06
 * description:
 */

@RestController
@RequestMapping("product")
public class ProductContoller {

    @Autowired
    private ProductService productService;

    @GetMapping("all")
    public Result showAll(){

        Result result = productService.findAll();

        return result;
    }


}
