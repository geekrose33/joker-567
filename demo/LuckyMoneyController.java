package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LuckyMoneyController {

    @Autowired
    private LuckyMoneyRepository repository;
    //导入编写好的jpa文件


    //获取红包列表
    @RequestMapping("/luckymoneylist")
    public List<LuckyMoney> list() {

        return repository.findAll();
    }

    //发红包就是创建红包得过程
    @PostMapping("/create")
    public LuckyMoney create(@RequestParam("producer") String producer, @RequestParam("money")
            BigDecimal money) {

        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);
        return repository.save(luckyMoney);
    }

}
