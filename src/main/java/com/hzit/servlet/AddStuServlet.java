package com.hzit.servlet;

import com.hzit.bean.Student;
import com.hzit.dao.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name ="Add",urlPatterns = {"/addStu"})
public class AddStuServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String birth=req.getParameter("birth");
        String sex=req.getParameter("sex");
        String usename=req.getParameter("usename");
        String password=req.getParameter("password");
        Student s=new Student();
        s.setId(id);
        s.setName(name);
        s.setBirth(birth);
        s.setSex(sex);
        s.setUsename(usename);
        s.setPassword(password);
        jdbc.insert(s);




    }
}



