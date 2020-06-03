package com.hzit.dao;

import com.hzit.bean.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class jdbc {
    private final static String url="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
    private final static String username="root";
    private final static String password="password";


    //加载驱动
    //获取连接
    public static Connection getCon(){
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//通过反射加载mysql驱动
            con = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return con;
    }


public static void insert(Student s){
        Connection con = getCon();

        String sql = "insert into student(id,name,birth,sex,usename,password)value(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,s.getId());
            preparedStatement.setString(2,s.getName());
            preparedStatement.setString(3,s.getBirth());
            preparedStatement.setString(4,s.getSex());
            preparedStatement.setString(5,s.getUsename());
            preparedStatement.setString(6,s.getPassword());
            int rlt=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
