package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-13 11:07
 */

public class EmpJavaBean {

    private String name;

    private int jobnum;

    private String position;

    private int salary;

    public EmpJavaBean(){
        System.out.println("EmpJavaBean无参构造方法");
    }


    public EmpJavaBean(String name,int jobnum,String position,int salary){
        this.jobnum = jobnum;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getJobnum(){
        return jobnum;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setJobnum(int jobnum){
        this.jobnum = jobnum;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
