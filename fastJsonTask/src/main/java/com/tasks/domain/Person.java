package com.tasks.domain;

import lombok.Data;

@Data
public class Person {
    private String pId;
    private String name;
    private int age;
    private String gender;
    private Address address;
}
