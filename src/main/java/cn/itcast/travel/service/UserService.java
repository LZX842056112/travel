package cn.itcast.travel.service;

import cn.itcast.travel.daomain.User;

/**
 *
 * @auther lizongxiao
 * @date 2019/9/8 - 16:02
 */
public interface UserService {
    //注册用户
    boolean regist(User user);

    //激活用户
    boolean active(String code);

    //登录方法
    User login(User user);

}
