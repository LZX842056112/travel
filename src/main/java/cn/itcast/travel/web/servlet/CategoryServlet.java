package cn.itcast.travel.web.servlet;

import cn.itcast.travel.daomain.Category;
import cn.itcast.travel.daomain.Route;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @auther lizongxiao
 * @date 2019/9/11 - 12:39
 */
@WebServlet("/category/*")
public class CategoryServlet extends BaseServlet {

    private CategoryService categoryService = new CategoryServiceImpl();
    private RouteService routeService = new RouteServiceImpl();

    //查询所有
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用service查询所有
        List<Category> cs = categoryService.findAll();
        //2.序列化json返回
        /*ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),cs);*/
        writeValue(cs,response);
    }

    public void findByCid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rid = request.getParameter("rid");
        Route route = routeService.findOne(rid);
        Category category = categoryService.findByCid(route.getCid());
        writeValue(category,response);

    }
}
