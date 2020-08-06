package com.company.jdbc;

import com.company.jdbc.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Joker_Dong
 * @date 2020-8-6 14:41
 */

public class JDBCDemoSql {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet resultSet = null;
        try{
            String sql1 = "update account set balance = balance - ? where id = ? ";
            String sql2 = "update account set balance = balance + ? where id = ? ";
            conn = JDBCutils.getConnection();


            // 在此处开启事物
            conn.setAutoCommit(false);


            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            // 设置参数
            pstmt1.setInt(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setInt(1,500);
            pstmt2.setInt(2,2);

            int count1 = pstmt1.executeUpdate();  // 返回影响的行数

            // 手动制造异常
            int i = 5/0;

            int count2 = pstmt2.executeUpdate();
            System.out.println("count1" + count1 + "count2" + count2);

            conn.commit();

        }catch (Exception e){

            // 事物进行回滚
//            try {
//                if (conn != null){
//                    conn.rollback();
//                }
//            }catch (SQLException e1){
//                e1.printStackTrace();
//            }

            e.printStackTrace();
        }finally {
            JDBCutils.close(pstmt1,conn);
            JDBCutils.close(pstmt2,conn);
        }
    }
}
