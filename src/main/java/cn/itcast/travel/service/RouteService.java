package cn.itcast.travel.service;

import cn.itcast.travel.daomain.PageBean;
import cn.itcast.travel.daomain.Route;

/**
 * @auther lizongxiao
 * @date 2019/9/12 - 12:17
 */
public interface RouteService {

    //分页条件查询
    public PageBean<Route> pageQuery(int cid,int currentPage,int pageSize,String rname);

    //根据id查询一个旅游线路的详情信息
    public Route findOne(String rid);

}
