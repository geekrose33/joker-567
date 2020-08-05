package com.company.jdbc.deptselectDemo;

import com.company.jdbc.deptselectDemo.domain.Dept;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-5 11:05
 */

public class JDBC_dept {
    public static void main(String[] args) throws Exception {
        System.out.println(new JDBC_dept().findAll());
    }
    public Dept findAll() throws Exception {
        ArrayList<Dept> depts= null;
        Statement statement = null;
        Connection conn = null;
        ResultSet resultSet = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
            statement = conn.createStatement();
            String sql = "select * from dept";
            resultSet = statement.executeQuery(sql);

            depts = new ArrayList<>();
            while (resultSet.next()){

                Dept dept = new Dept();
                dept.setDeptno(resultSet.getInt(1));
                dept.setDname(resultSet.getString(2));
                dept.setLoc(resultSet.getString(3));
                depts.add(dept);
            }


            for (Dept dept :depts
            ) {

                System.out.println("编号： " + dept.getDeptno() + ", 部门名： " + dept.getDname() + ", 部门位置： " + dept.getLoc());
            }

        }catch(ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (statement != null){
                try {
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }



        return null;
    }
}
