package top_caicaizi.service;

import top_caicaizi.dao.Studentdao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        int student_id = Integer.parseInt(req.getParameter("student_id"));
        Studentdao studentdao = new Studentdao();
        boolean result = studentdao.deletestudent(student_id);
        int student_id2=student_id+1;
        boolean move = studentdao.move(student_id2);
        if(result){
            System.out.println("学生删除成功！");
        }
        if(move){
            System.out.println("学生前移成功！");
        }
        if(result){
            req.getRequestDispatcher("/allstu").forward(req,resp);
        }
    }
}
