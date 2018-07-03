package com.tasks.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private Integer pId;
    private String personName;
    private Integer personAge;
    private String gender;
    private Date create_Date;
    private String remark;
}
