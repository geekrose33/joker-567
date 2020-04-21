package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {
    //引用最小金额
    @Autowired
    //@Autowired：自动导入依赖的bean，可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。与@Resource功能相似，
    // 但默认根据类型进行自动装配的，如果需要按名称进行装配，则需要配合@Qualifier。
    private LimitConfig limitConfig;
    @RequestMapping("/desc")
    //@RequestMapping：提供路由信息，负责URL到Controller中的具体函数的映射。
    public String desc(){
        return "最小金额是" + limitConfig.getMinMoney() + "最大金额是" +
                limitConfig.getMaxMoney() + "红包描述是" + limitConfig.getDescription();
    }
//    @Value ("${minMoney}")
    //@Value：将配置文件中key对应的值赋值给它标注的属性
//    private BigDecimal minMoney;
//
//    @RequestMapping("/min")
//    public String min(){
//        return "最小金额" + minMoney;
//    }
//    @Value("${maxMoney}")
//    private BigDecimal maxMoney;
//
//    @RequestMapping("/max")
//    public String max(){
//        return "最大金额" + maxMoney;
//    }
//
//   @RequestMapping("/hello")
//    public String sayhello(){
//        return "Hello Spring boot";
//    }
//
//    @RequestMapping("/detail")
//    public String detail(){
//        return "这是商品详情页";
//    }
//
//    @RequestMapping("/description")
//    public String description(){return "恭喜发财，大吉大利";}

    }

