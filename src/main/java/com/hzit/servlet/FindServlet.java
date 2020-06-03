package com.hzit.servlet;
import com.hzit.bean.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name ="find",urlPatterns = {"/findStu"})
public class FindServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
            String username = "root";
            String password = "password";
            try {
                Connection conn = DriverManager.getConnection(url, username, password);
                String sql = "select * from student";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery(sql);
                List<Student> list = new ArrayList<Student>();
                while (rs.next()) {
                    Student s = new Student();
                    s.setId(rs.getString(1));
                    s.setName(rs.getString(2));
                    s.setBirth(rs.getString(3));
                    s.setSex(rs.getString(4));
                    s.setUsename(rs.getString(5));
                    s.setPassword(rs.getNString(6));
                    list.add(s);
                }
                request.setAttribute("list", list);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("query.jsp").forward(request,response);
    }

}
