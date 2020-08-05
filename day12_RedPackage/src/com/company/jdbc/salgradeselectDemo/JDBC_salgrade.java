package com.company.jdbc.salgradeselectDemo;

import com.company.jdbc.salgradeselectDemo.domain.Salgrade;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-5 11:39
 */

public class JDBC_salgrade {
    public static void main(String[] args) throws Exception {

        System.out.println(new JDBC_salgrade().findAll());

    }
    public Salgrade findAll() throws Exception {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
            statement = connection.createStatement();

            String sql = "select  * from salgrade";
            resultSet = statement.executeQuery(sql);

            ArrayList<Salgrade> salgrades = new ArrayList<>();
            while (resultSet.next()){

                Salgrade salgrade = new Salgrade();
                salgrade.setGrade(resultSet.getInt(1));
                salgrade.setLosal(resultSet.getInt(2));
                salgrade.setHisal(resultSet.getInt(3));
                System.out.println("grade: " + salgrade.getGrade() + ",losal: " + salgrade.getLosal() + ",hisal: " + salgrade.getHisal());
                salgrades.add(salgrade);
            }

        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (resultSet != null){
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
