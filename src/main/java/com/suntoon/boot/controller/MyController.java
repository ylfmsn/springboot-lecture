package com.suntoon.boot.controller;

import com.suntoon.boot.config.MyConfigBean;
import com.suntoon.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MyController {

    // 直接从配置文件拿到自定义的配置
    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    // 通过配置类拿到自定义的配置
    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "test")
    public Person getData() {

        Person person = new Person();
        //person.setName("liruipeng");
        person.setName(myName);
        person.setId(3);
        person.setAge(myConfigBean.getMyAge());

        return person;
    }
}
