package com.tasks.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "person")
public class Person {
    /**
     * 指定主键,并制定主键的生成策略为自动
     */
    @Id
    @Column(name = "pId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pId;
    @Column(name = "person_name")
    private String name;
    @Column(name="person_age")
    private Integer age;
    private String remark;
    private String gender;
    private Date createDate;
    @OneToOne(cascade = {CascadeType.ALL},optional = false)
    @JoinColumn(name="address_id",referencedColumnName = "id",unique = true)
    private Address address;
}
