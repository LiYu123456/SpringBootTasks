package com.tasks.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tasks.entity.Person;
import com.tasks.mapper.PersonMapper;
import com.tasks.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public PageInfo<Person> getAll() {
        PageHelper.startPage(0,2);
        List<Person> list= personMapper.getAll();
        PageInfo<Person> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Person getPersonById(String personId) {
        return personMapper.getPersonById(personId);
    }

    @Override
    @Transactional
    public void insert(Person person) {
        personMapper.save(person);
    }

    @Override
    @Transactional
    public void delete(String pId) {
        personMapper.delete(pId);
    }

    @Override
    @Transactional
    public void update(Person person) {
        personMapper.update(person);
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return personMapper.selectPersonByName(name);
    }

    @Transactional
    public void save2(Person person){
        personMapper.save2(person);
    }
}
