package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.Route;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/12 - 13:12
 */
public interface RouteDao {
    //根据cid查询总记录数
    public int findTotalCount(int cid,String rname);

    //根据cid，start，pageSize查询当前页的数据集合
    public List<Route> findByPage(int cid,int start,int pageSize,String rname);

    //根据id查询
    public Route findOne(int rid);

    //根据cid查询
    public List<Route> findByCid(int cid);
}
