package com.itqf.hsjxc.mapper;

import com.itqf.hsjxc.bean.Types;

import java.util.List;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/3 15:13
 * description:types类数据库操作的mapper
 */
public interface TypesMapper {
    /**
     * 插入数据的方法
     * @param types
     * @return int  DML insert update delete 返回的影响行数
     */
    int insertTypes(Types types);

    /**
     * 查询全部
     * @return
     */
    List<Types> queryTypeList();

    /**
     * 修改方法
     * @param types
     * @return
     */
    int updateTypes(Types types);

}
