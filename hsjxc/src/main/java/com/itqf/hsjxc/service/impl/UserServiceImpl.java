package com.itqf.hsjxc.service.impl;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.User;
import com.itqf.hsjxc.mapper.UserMapper;
import com.itqf.hsjxc.service.UserService;
import com.itqf.hsjxc.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/2 16:55
 * description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {

        //1.账号密码加密处理
        String newPwd = DigestUtils.md5DigestAsHex(
                        (user.getuPassword()+ Constants.SALT).getBytes());
        user.setuPassword(newPwd);
        //2.查询
        User retUser = userMapper.queryUser(user);
        //3.返回结果
        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(retUser);
        }else {
            result.setCode(0);
        }
        return result;
    }
}
