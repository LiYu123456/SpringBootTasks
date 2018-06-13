package com.tasks.web;

import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ApiOperation("保存")
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public void save(){
        Person person=new Person();
        person.setPId(0);
        person.setAge(11);
        person.setName("张三");
        person.setGender("女");
        personService.save(person);

    }
    @ApiOperation("删除")
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void delete(){
        personService.delete(1);
    }

    @ApiOperation("查询所有")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Iterable<Person> findAll(){
        return personService.findAll();
    }
}
