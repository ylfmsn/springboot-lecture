package com.suntoon.boot.controller;

import com.suntoon.boot.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MyController {

    @RequestMapping(value = "test")
    public Person getData() {

        Person person = new Person();
        person.setName("liruipeng");
        person.setId(3);
        person.setAddress("weinan");

        return person;
    }
}
