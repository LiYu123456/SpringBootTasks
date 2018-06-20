package com.tasks.dao;

import com.tasks.entity.Person;

public interface PersonDao {
    public void save(Person person);
    public Person getPersonById(String personId);
}
