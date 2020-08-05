package com.company.jdbc.empselectDemo;

import com.company.jdbc.empselectDemo.domain.EMP;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-8-5 9:48
 */

public class JDBC_emp {
    public static void main(String[] args) {
        // 定义一个方法,查询emp表中所有的记录/数据
        System.out.println(new JDBC_emp().finndAll());
    }
    public List<EMP> finndAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        ArrayList<EMP> emps = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from emp";
            stmt = conn.createStatement();


            // 封装查询结果
            resultSet = stmt.executeQuery(sql); // Query 查询

             emps = new ArrayList<>();

            while (resultSet.next()){
                // 类似于iterator迭代器
                // 让游标移动以下
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString("name");
//                int balance = resultSet.getInt("balance");
//
//                System.out.println("id: " + id + " , name: " + name + ", balance: " + balance);

                // 封装出来的结果集

                EMP emp = new EMP();
                emp.setId(resultSet.getInt(1));
                emp.setEname(resultSet.getString(2));
                emp.setJob(resultSet.getString(3));
                emp.setMgr(resultSet.getInt(4));
                emp.setHiredate(resultSet.getDate(5));
                emp.setSalary(resultSet.getInt(6));
                emp.setBonus(resultSet.getInt(7));
                emp.setDeptno(resultSet.getInt(8));
                emps.add(emp);
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
        return emps;
    }
}
