package com.tasks.web;

import com.tasks.domain.Address;
import com.tasks.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @RequestMapping(value = "/getPersonJSON",method = RequestMethod.GET)
    public Person getPersonJSON(){
        Person person=new Person();
        person.setPId("1");
        person.setName("张飞");
        person.setAge(10);
        person.setGender("女");
        Address address=new Address();
        address.setProvince("北京");
        address.setCity("昌平区");
        address.setStreet("阳坊镇");
        person.setAddress(address);
        return person;
    }

}
