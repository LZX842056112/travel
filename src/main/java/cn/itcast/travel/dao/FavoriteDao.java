package cn.itcast.travel.dao;

import cn.itcast.travel.daomain.Favorite;

/**
 * @auther lizongxiao
 * @date 2019/9/14 - 12:43
 */
public interface FavoriteDao {

    //根据rid和uid查询收藏信息
    public Favorite findByRidAndUid(int rid, int uid);

    //根据rid查询收藏次数
    public int findCountByRid(int rid);

    //添加收藏
    public void add(int rid, int uid);
}
