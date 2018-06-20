package com.tasks.service.impl;

import com.tasks.dao.PersonDao;
import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void save(Person person) {
        personDao.save(person);
    }
}
