package top_caicaizi.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/****?characterEncoding=utf8";
    private static String username = "****";
    private static String password = "******";
    private static Connection con = null;

    public static Connection getConnection(){
        if(con==null){
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url,username,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;
    }

    //测试数据库连接是否成功
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
