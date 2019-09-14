package cn.itcast.travel.service;

/**
 * @auther lizongxiao
 * @date 2019/9/14 - 12:41
 */
public interface FavoriteService {

    //判断是否收藏
    public boolean isFavorite(String rid,int uid);

    //添加收藏
    public void add(String rid, int uid);
}
