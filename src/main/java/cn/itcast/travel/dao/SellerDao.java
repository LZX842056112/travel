package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.Seller;

/**
 * @auther lizongxiao
 * @date 2019/9/13 - 17:34
 */
public interface SellerDao {

    //根据id查询
    public Seller findById(int id);

}
