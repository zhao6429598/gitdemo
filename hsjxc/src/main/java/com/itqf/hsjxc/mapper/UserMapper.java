package com.itqf.hsjxc.mapper;

import com.itqf.hsjxc.bean.User;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/2 17:17
 * description:用户模块数据库操作的接口文件
 */
public interface UserMapper {

    /**
     * 查询动作
     * @param user 有账号密码的user
     * @return 全新的user除了账号密码还有其他信息
     */
    User  queryUser(User user);

}
