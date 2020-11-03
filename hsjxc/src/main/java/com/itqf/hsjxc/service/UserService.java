package com.itqf.hsjxc.service;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.User;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/2 16:44
 * description:
 */
public interface UserService {

    /**
     * 登录业务方法
     * @param user
     * @return
     */
    Result login(User user);
}
