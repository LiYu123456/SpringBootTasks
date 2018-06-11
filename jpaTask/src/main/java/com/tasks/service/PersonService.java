package com.tasks.service;

import com.tasks.entity.Person;

public interface PersonService {
     void save(Person person);
     void delete(int pId);
     Iterable<Person> findAll();
}
