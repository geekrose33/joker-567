package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Joker_Dong
 * @date 2020-8-5 9:14
 */

public class JDBCDemo04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "delete  from account where id =4";
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);// 返回受影响的行数

            if(count > 0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }

        }catch ( ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
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

        }
    }
}