package com.mayzhou.dp.creating_pattern.abstract_factory.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 04:10
 * @Description:
 * @copyright:
 * @version:
 */
public class JdbcTest {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/yun?" + "useUnicode=true&characterEncoding=UTF8";
        String user = "root";
        String pass = "root";
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, pass);

    }
}
