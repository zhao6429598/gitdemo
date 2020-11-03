package com.itqf.hsjxc.controller;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.Types;
import com.itqf.hsjxc.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 15:03
 * description:类别模块的controller
 */
@RestController
@RequestMapping("types")
public class TypesController {

    @Autowired
    private TypesService typesService;

    /**
     * 保存types的方法
     * @param types
     * @return
     */
    @PostMapping("save")
    public Result saveTypes(Types types){

        Result result = typesService.saveTypes(types);

        return result;
    }

}
