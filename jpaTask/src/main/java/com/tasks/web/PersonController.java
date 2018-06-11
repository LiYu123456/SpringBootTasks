package com.tasks.web;

import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/save")
    public void save(){
        Person person=new Person();
        person.setAge(11);
        person.setName("张三");
        person.setGender("女");
        personService.save(person);

    }
    @RequestMapping("/delete")
    public void delete(){
        personService.delete(1);
    }

    @RequestMapping("/findAll")
    public Iterable<Person> findAll(){
        return personService.findAll();
    }
}
