package com.company.jdbc.studentAdmin.dao.impl;

import com.company.jdbc.studentAdmin.dao.StudentDao;
import com.company.jdbc.studentAdmin.domain.Student;
import com.company.jdbc.studentAdmin.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-8-6 15:59
 */

public class StudentDaoImpl implements StudentDao {



    @Override
    public List<Student> findAll() {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCutils.getConnection();

            String sql = "select * from studentManager";

            pstmt = connection.prepareStatement(sql);

            resultSet = pstmt.executeQuery();

            ArrayList<Student> students = new ArrayList<>();

            while (resultSet.next()){
                Student student = new Student();

                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setGender(resultSet.getString(3));
                student.setScore(resultSet.getInt(4));
                student.setAddr(resultSet.getString(5));
                student.setTell(resultSet.getString(6));
                students.add(student);
            }
            return students;

        }catch (SQLException e){
            System.out.println("出错了");
            e.printStackTrace();
        }finally {
            JDBCutils.close(resultSet,pstmt,connection);
        }

        return null;
    }

    @Override
    public void save(Student student) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCutils.getConnection();

            // 设置事物开始点
            connection.setAutoCommit(false);

            String sql = "insert into studentManager values (null , ? , ? , ? , ? , ? )";
//            System.out.println("--------");
            preparedStatement = connection.prepareStatement(sql);
            // 设置参数

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getGender());
            preparedStatement.setInt(3,student.getScore());
            preparedStatement.setString(4,student.getAddr());
            preparedStatement.setString(5,student.getTell());

            int count = preparedStatement.executeUpdate();
            System.out.println("添加成功，影响行数为： " + count);

            // 提交事物
            connection.commit();


        }catch (SQLException e){

            try {
                // 事物回滚
                connection.rollback();

            }catch (SQLException e1){
                e1.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCutils.close(preparedStatement,connection);
        }

    }

    @Override
    public void remove(Integer id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCutils.getConnection();

            // 设置事物开始点
            connection.setAutoCommit(false);

            String sql = "delete from studentManager where id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int count = preparedStatement.executeUpdate();
            System.out.println("受影响的行数为： " + count);

            // 提交事物
            connection.commit();

        }catch (SQLException e){
            try {
                // 事物回滚
                connection.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCutils.close(preparedStatement,connection);
        }
    }

    @Override
    public void update(Student student) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCutils.getConnection();

            // 设置事物开始点
            connection.setAutoCommit(false);

            String sql = "update studentManager set score = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,student.getScore());
            preparedStatement.setInt(2,student.getId());
            int count = preparedStatement.executeUpdate();
            System.out.println("受影响的行数为： " + count);

            // 提交事物
            connection.commit();

        }catch (SQLException e){

            try {
                // 事物回滚
                connection.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCutils.close(preparedStatement,connection);
        }
    }
}
