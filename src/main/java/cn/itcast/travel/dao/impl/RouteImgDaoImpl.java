package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.daomain.Category;
import cn.itcast.travel.daomain.Route;
import cn.itcast.travel.daomain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/13 - 17:26
 */
public class RouteImgDaoImpl implements RouteImgDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //根据route的id查询图片
    @Override
    public List<RouteImg> findByRid(int rid) {
        String sql = " select * from tab_route_img where rid = ?";
        return template.query(sql,new BeanPropertyRowMapper<RouteImg>(RouteImg.class),rid);
    }
}
