package com.company.jdbc;

import java.sql.*;

/**
 * @author Joker_Dong
 * @date 2020-8-5 9:18
 */

public class JDBCDemo05 {
    // 查询
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from account";
            stmt = conn.createStatement();


            // 封装查询结果
            resultSet = stmt.executeQuery(sql); // Query 查询
            while (resultSet.next()){
                // 类似于iterator迭代器
                // 让游标移动以下
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                int balance = resultSet.getInt("balance");

                System.out.println("id: " + id + " , name: " + name + ", balance: " + balance);
            }





        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
