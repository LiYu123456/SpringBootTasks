package com.tasks.web;

import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
    public void savePerson(@RequestBody Person person){
        personService.save(person);
    }
}
