package com.tasks.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Person {
    /**
     * 指定主键,并制定主键的生成策略为自动
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pId;
    private String name;
    private int age;
    private String remark;
    private String gender;
    private Date createDate;
    private Address address;
}
