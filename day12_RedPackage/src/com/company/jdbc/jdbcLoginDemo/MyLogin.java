package com.company.jdbc.jdbcLoginDemo;

import com.alibaba.druid.sql.visitor.functions.If;
import com.company.jdbc.utils.JDBCutils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-6 11:37
 */

public class MyLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入密码");
        String passWord = scanner.nextLine();
        boolean flag = new MyLogin().user_pass(userName, passWord);
        if (flag){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
    public boolean user_pass(String userName, String passWord){
        if (userName == null || passWord == null){
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCutils.getConnection();



            String sql = "select * from user where username = ? and  password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,passWord);

            resultSet = pstmt.executeQuery();
//            return resultSet.next();
            if (resultSet.next()){
                return true;
            }else{
                return false;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCutils.close(resultSet,pstmt,conn);
        }

        return false;
    }

}
