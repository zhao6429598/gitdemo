package com.itqf.hsjxc.service.impl;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.Types;
import com.itqf.hsjxc.mapper.TypesMapper;
import com.itqf.hsjxc.service.TypesService;
import com.itqf.hsjxc.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 15:10
 * description:types业务实现类
 */
@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesMapper typesMapper;

    @Override
    public Result saveTypes(Types types) {

        int rows = typesMapper.insertTypes(types);

        Result result = new Result();

        if (rows>0) {
            //获取新的类型集合
            List<Types> list = typesMapper.queryTypeList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else{
            result.setCode(Constants.FAIL);
        }
        return result;
    }
}
