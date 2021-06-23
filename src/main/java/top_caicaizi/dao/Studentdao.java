package top_caicaizi.dao;

import top_caicaizi.pojo.Student;
import top_caicaizi.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Studentdao {
    //添加学生
    public boolean addstudent(Student student){
        Connection con =DbUtils.getConnection();
        String sql = "INSERT INTO student(student_number,student_name,student_password,student_sex) VALUES(?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,student.getStudent_number());
            pst.setString(2,student.getStudent_name());
            pst.setString(3,student.getStudent_password());
            pst.setInt(4,student.getStudent_sex());

            int i = pst.executeUpdate();
            pst.close();
            if(i>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    //按照id删除学生
    public boolean deletestudent(int student_id){
        Connection con = DbUtils.getConnection();
        String sql = "DELETE FROM student WHERE student_id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,student_id);
            int i = pst.executeUpdate();
            pst.close();
            if(i>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    //根据id修改学生信息
    public boolean updatestudent(Student student){
        Connection con = DbUtils.getConnection();
        String sql = "UPDATE student SET student_number=?,student_name=?,student_password=?,student_sex=? WHERE student_id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,student.getStudent_number());
            pst.setString(2,student.getStudent_name());
            pst.setString(3,student.getStudent_password());
            pst.setInt(4,student.getStudent_sex());
            pst.setInt(5,student.getStudent_id());
            int i = pst.executeUpdate();
            pst.close();
            if(i>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    //根据id查询学生信息
    public Student getstudentbyid(int student_id){
        Connection con = DbUtils.getConnection();
        String sql = "SELECT * FROM student WHERE student_id=?";
        Student student = new Student();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,student_id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                student.setStudent_id(rs.getInt("student_id"));
                student.setStudent_number(rs.getInt("student_number"));
                student.setStudent_name(rs.getString("student_name"));
                student.setStudent_password(rs.getString("student_password"));
                student.setStudent_sex(rs.getInt("student_sex"));
            }
            rs.close();
            pst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return student;
    }

    //查询所有学生信息
    public List<Student> getAllstudent(){
        List<Student> studentlist = new ArrayList<>();
        Connection con = DbUtils.getConnection();
        String sql = "SELECT * FROM student";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setStudent_id(rs.getInt("student_id"));
                student.setStudent_number(rs.getInt("student_number"));
                student.setStudent_name(rs.getString("student_name"));
                student.setStudent_password(rs.getString("student_password"));
                student.setStudent_sex(rs.getInt("student_sex"));
                studentlist.add(student);
            }
            rs.close();
            pst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentlist;
    }

    //删除一个学生后的后一个学生id减1，实现学生前移
    public boolean move(int student_id){
        Connection con = DbUtils.getConnection();
        String sql = "UPDATE student SET student_id=? WHERE student_id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,student_id-1);
            pst.setInt(2,student_id);
            int i = pst.executeUpdate();
            pst.close();
            if(i>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
