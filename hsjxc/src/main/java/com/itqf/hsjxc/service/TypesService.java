package com.itqf.hsjxc.service;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.Types;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 15:08
 * description:types的业务接口类
 */
public interface TypesService {

    /**
     * 保存类型的业务方法
     * @param types
     * @return
     */
    Result saveTypes(Types types);

}
