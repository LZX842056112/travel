package cn.itcast.travel.service;

import cn.itcast.travel.daomain.PageBean;
import cn.itcast.travel.daomain.Route;

/**
 * @auther lizongxiao
 * @date 2019/9/12 - 12:17
 */
public interface RouteService {

    //分页条件查询
    PageBean<Route> pageQuery(int cid,int currentPage,int pageSize,String rname);
}
