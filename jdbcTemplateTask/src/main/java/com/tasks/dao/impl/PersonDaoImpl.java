package com.tasks.dao.impl;

import com.tasks.dao.PersonDao;
import com.tasks.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Person person) {
        jdbcTemplate.execute("");
    }

    @Override
    public Person getPersonById(String personId) {
        String sql="select * from person where personId=?";
        RowMapper<Person> rowMapper=new BeanPropertyRowMapper(Person.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,new Object[]{personId});
    }

}
