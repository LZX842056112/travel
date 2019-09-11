package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.daomain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @auther lizongxiao
 * @date 2019/9/11 - 15:06
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    //查询所有
    @Override
    public List<Category> findAll() {
        //1.从redis中查询
        //1.1获取jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        //1.2可使用sortedset排序查询
        Set<String> categorys = jedis.zrange("category", 0, -1);
        List<Category> cs = null;
        //2.判断查询的集合是否为空
        if (categorys == null || categorys.size() == 0){
            System.out.println("从数据库中查询...");
            //3.如果为空，需要从数据库查询，在将数据库存入redis
            //3.1从数据库查询
            cs = categoryDao.findAll();
            //3.将集合存储到redis中的category的key
            for (int i = 0; i < cs.size(); i++) {
                jedis.zadd("category",cs.get(i).getCid(),cs.get(i).getCname());
            }
        }else {
            System.out.println("从redis中查询...");
            //4.如果不为空，将set的数据存入list
            cs = new ArrayList<Category>();
            for (String name : categorys) {
                Category category = new Category();
                category.setCname(name);
                cs.add(category);
            }
        }
        return cs;
    }
}

