package top_caicaizi.service;

import top_caicaizi.dao.Studentdao;
import top_caicaizi.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//相当于控制层，几个功能都得通过这个类去刷新数据库获取数据，再跳到AllStudent.jsp

public class AllstudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Studentdao studentdao = new Studentdao();
        List<Student> list = studentdao.getAllstudent();
        req.setAttribute("studentlist",list);
        req.getRequestDispatcher("/AllStudent.jsp").forward(req,resp);
    }
}
