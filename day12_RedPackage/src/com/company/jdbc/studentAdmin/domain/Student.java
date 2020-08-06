package com.company.jdbc.studentAdmin.domain;

/**
 * @author Joker_Dong
 * @date 2020-8-6 15:49
 */

public class Student {
    // javabean
    private int id;
    private String name;
    private String gender;
    private int score;
    private String addr;
    private String tell;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Student( String name, String gender, int score, String addr, String tell) {

        this.name = name;
        this.gender = gender;
        this.score = score;
        this.addr = addr;
        this.tell = tell;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", addr='" + addr + '\'' +
                ", tell='" + tell + '\'' +
                '}';
    }

    public Student() {
    }
}
