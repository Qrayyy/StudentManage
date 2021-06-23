package top_caicaizi.test;

import top_caicaizi.dao.Studentdao;
import top_caicaizi.pojo.Student;

public class update {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent_id(4);
        student.setStudent_number(2001);
        student.setStudent_name("abc");
        student.setStudent_password("ckw");
        student.setStudent_sex(0);
        Studentdao studentdao = new Studentdao();
        boolean updatestudent = studentdao.updatestudent(student);
        if(updatestudent){
            System.out.println("更改成功！");
        }
    }
}
