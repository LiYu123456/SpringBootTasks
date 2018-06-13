package com.tasks.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class Address {
    private String aId;
    private String province;
    private String city;
    private String street;
}
