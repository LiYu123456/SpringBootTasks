package com.tasks.web;

import com.tasks.entity.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/globalException")
public class PersonController {

    @RequestMapping(value="/defaultGolbalException",method = RequestMethod.GET)
    public Person defaultGolbalException() throws Exception {
        Person person=new Person();
        person.setPersonId("1");
        person.setName("张三");
        person.setAge(1);
        person.setGender("female");
        throw new Exception("123");

    }

    @PostMapping("/savePerson")
    public Person savePerson(@RequestBody @Valid Person person){
        return person;
    }
}
