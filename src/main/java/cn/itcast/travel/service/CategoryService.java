package cn.itcast.travel.service;

import cn.itcast.travel.daomain.Category;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/11 - 15:06
 */
public interface CategoryService {

    //查询所有
    List<Category> findAll();
}
