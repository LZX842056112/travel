package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.daomain.Category;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/11 - 14:59
 */
public class CategoryDaoImpl implements CategoryDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //查询所有
    @Override
    public List<Category> findAll() {
        String sql = "select * from tab_category ";
        return template.query(sql,new BeanPropertyRowMapper<Category>(Category.class));
    }

    //根据cid查询
    @Override
    public Category findByCid(int cid) {
        String sql = "select * from tab_category where cid = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<Category>(Category.class),cid);
    }
}
