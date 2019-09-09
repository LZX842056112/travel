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

    //根据激活码查询用户对象
    User findByCode(String code);

    //修改指定用户激活状态
    void updateStatus(User user);
}
