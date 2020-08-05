package com.company.jdbc.salgradeselectDemo.domain;

/**
 * @author Joker_Dong
 * @date 2020-8-5 11:39
 */

public class Salgrade {
    private int  grade;
    private int losal;
    private int hisal;
    public Salgrade(){}

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getLosal() {
        return losal;
    }

    public void setLosal(int losal) {
        this.losal = losal;
    }

    public int getHisal() {
        return hisal;
    }

    public void setHisal(int hisal) {
        this.hisal = hisal;
    }
}
