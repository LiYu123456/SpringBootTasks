package com.tasks.service.impl;

import com.tasks.dao.PersonRepository;
import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;


    @Override
    @Transactional
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    @Transactional
    public void delete(int pId) {
        personRepository.delete(pId);
    }

    @Override
    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }


}
