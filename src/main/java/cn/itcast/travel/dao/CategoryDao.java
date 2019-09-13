package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.Category;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/11 - 14:55
 */
public interface CategoryDao {

    //查询所有
    List<Category> findAll();

}
