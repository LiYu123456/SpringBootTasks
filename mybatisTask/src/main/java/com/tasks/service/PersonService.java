package com.tasks.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tasks.entity.Person;

import java.util.List;

public interface PersonService {
    PageInfo<Person> getAll();
    Person getPersonById(String personId);
    void insert(Person person);
    void delete(String pId);
    void update(Person person);
    List<Person> getPersonByName(String name);
    void save2(Person person);
}
