package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.User;

/**
 * @auther lizongxiao
 * @date 2019/9/8 - 16:03
 */
public interface UserDao {
    //根据用户名查询用户信息
    public User findByUsername(String username);
    //用户保存
    public void save(User user);

    User findByCode(String code);

    void updateStatus(User user);
}
