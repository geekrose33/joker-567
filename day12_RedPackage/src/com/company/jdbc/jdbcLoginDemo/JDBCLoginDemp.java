package com.company.jdbc.jdbcLoginDemo;

import com.company.jdbc.utils.JDBCutils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-6 11:06
 */

public class JDBCLoginDemp {
    public static void main(String[] args) {
        // 键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String userName = sc.nextLine();

        System.out.println("请输入您的密码");
        String passWord = sc.nextLine();
        // 编写一个方法Login 判断用户用户名和密码是否正确
        boolean flag = new JDBCLoginDemp().login(userName, passWord);
        if (flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }
//    public boolean login(String userName, String passWord){
//        // 判断是否为空
//        if (userName == null || passWord == null){
//            return false;
//        }
//
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet resultSet = null;
//        try {
//            conn = JDBCutils.getConnection();
//            // sql
//            String sql = "select * from user where username = '"+userName+"'and password = '" + passWord + "'";
//            StringBuilder sql2 =  new StringBuilder("select * from user where username = '")
//                    .append(userName).append("' and password= '").append(passWord).append("'");
//            // StringBuilder 可变字符串
//            System.out.println(sql);
//            System.out.println(sql2);
//
//            stmt = conn.createStatement();
//            resultSet = stmt.executeQuery(sql);
//            return resultSet.next();
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            JDBCutils.close(resultSet,stmt,conn);
//        }
//
//        return false;
//
//    }
    public boolean login(String userName, String passWord){
        // 判断是否为空
        if (userName == null || passWord == null){
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCutils.getConnection();
            // sql
            String sql = "select * from user where username = ? and password = ? ";
            // 先获取执行sql的对象 PreparedStatement
            pstmt = conn.prepareStatement(sql);
//            stmt = conn.createStatement();
            // 给？赋值
            pstmt.setString(1,userName);
            pstmt.setString(2,passWord);
            System.out.println(sql);
            //执行查询 不需要传递sql
            resultSet = pstmt.executeQuery();
//            return resultSet.next(); // 如果有下一行 返回true
            if (resultSet.next()){
                return true;
            }else {
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
