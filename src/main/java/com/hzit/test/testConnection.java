package com.hzit.test;

import com.hzit.dao.jdbc;


import java.sql.Connection;

public class testConnection {


    public static void main(String[] args) {
        Connection con = jdbc.getCon();
        System.out.println(con);
    }
}
