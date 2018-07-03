package com.tasks.web;

import com.github.pagehelper.PageInfo;
import com.tasks.entity.Person;
import com.tasks.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@Api(tags = "人员类")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ApiOperation("得到所有的Person对象")
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public PageInfo<Person> getAll(){
        return personService.getAll();
    }

    @ApiOperation("根据personId得到Person对象")
    @ApiImplicitParam(name = "id",value = "Person的ID",required = true,dataTypeClass = String.class)
    @RequestMapping(value="/getPersonById",method = RequestMethod.GET)
    public Person getPersonById(@RequestParam String personId){
        return personService.getPersonById(personId);
    }

    @ApiOperation(value = "保存Person对象",notes = "保存Person到表中")
    @ApiImplicitParams({
    @ApiImplicitParam(name="pId",value = "ID",dataType = "Long",paramType = "form"),
    @ApiImplicitParam(name="personName",value = "人名",dataType = "string",paramType = "form"),
    @ApiImplicitParam(name="personAge",value = "年龄",dataType = "Long",paramType = "form")
    })
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(Person person){
        personService.insert(person);
        System.out.println(person.getPId());
    }

    @RequestMapping(value = "/getPerosnByName",method = RequestMethod.GET)
    public String getPersonByName(String name){
        return personService.getPersonByName(name).toString();
    }

    @ApiOperation(value = "XML保存",notes = "保存后自动返回ID")
    @RequestMapping(value = "/save2",method = RequestMethod.POST)
    public Person save2(Person person){
        personService.save2(person);
        return person;
    }
}
