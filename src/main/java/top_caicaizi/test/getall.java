package top_caicaizi.test;

import top_caicaizi.pojo.Student;
import top_caicaizi.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getall {
    public static void main(String[] args) {
        Connection con = DbUtils.getConnection();
        String sql = "SELECT * FROM student";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("student_id"));
                System.out.println(rs.getInt("student_number"));
                System.out.println(rs.getString("student_name"));
                System.out.println(rs.getString("student_password"));
                System.out.println(rs.getInt("student_sex"));
            }
            rs.close();
            pst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
