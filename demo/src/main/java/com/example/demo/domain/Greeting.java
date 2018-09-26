package com.example.demo.domain;

import lombok.Data;

@Data
public class Greeting {
    private long id;
    private String name;
    private int age;

    public Greeting(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
