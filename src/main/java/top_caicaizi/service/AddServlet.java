package top_caicaizi.service;

import top_caicaizi.dao.Studentdao;
import top_caicaizi.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        int student_number = Integer.parseInt(req.getParameter("student_number"));
        String student_name = req.getParameter("student_name");
        String student_password = req.getParameter("student_password");
        int student_sex=Integer.parseInt(req.getParameter("student_sex"));

        Student student = new Student();
        student.setStudent_number(student_number);
        student.setStudent_name(student_name);
        student.setStudent_password(student_password);
        student.setStudent_sex(student_sex);

        Studentdao studentdao = new Studentdao();
        boolean addstudent = studentdao.addstudent(student);
        if(addstudent){
            System.out.println("添加成功！");
            req.setAttribute("addsuccess","添加成功！");
            req.getRequestDispatcher("/allstu").forward(req,resp);
        }
    }
}
