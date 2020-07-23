package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
//表示这是一个实体类
public class LuckyMoney {
    @Id
    //主键
    @GeneratedValue
    //自增长

    private Integer id;

    private BigDecimal money;

    private String producer;
    //发送方
    private String consumer;

    //接受方
    public LuckyMoney() {
    }
    //构造器

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
