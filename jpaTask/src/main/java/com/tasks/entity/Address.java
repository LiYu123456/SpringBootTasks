package com.tasks.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String aId;
    private String province;
    private String city;
    private String street;
    @OneToOne(mappedBy = "address")
    private Person person;
}
