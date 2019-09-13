package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.RouteImg;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/13 - 17:24
 */
public interface RouteImgDao {

    //根据route的id查询图片
    public List<RouteImg> findByRid(int rid);
}
