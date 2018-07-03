package com.tasks.mapper;

import com.tasks.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {

    //查询所有
    @Select("select * from person")
    //如果数据库字段和实体类属性不能对应可以用@Result注解配置
    //如果属性是枚举类型也可以这样设置
    @Results({
        @Result(property = "pId",column = "p_Id",javaType = Integer.class),
        @Result(property = "personName",column = "person_name",javaType = String.class),
        @Result(property = "personAge",column = "person_age",javaType = Integer.class)
    })
    List<Person> getAll();

    //查询ById
    @Select("select * from person where p_Id=#{personId}")
    //在标注中使用条件
    /*@Select("<script>select * from person where 1=1 "
            +" <if test='personId !=null'>"
            +" and p_Id=#{personId} "
            +" </if>"
            +" </script>")*/
    Person getPersonById(String personId);

    //插入
    @Insert("insert into person(p_Id,person_name,person_age,gender,remark)values(#{pId},#{personName},#{personAge},#{gender},#{remark})")
    //保存后返回主键ID
    @Options(keyProperty = "pId",keyColumn = "p_Id",useGeneratedKeys = true)
    void save(Person person);

    void save2(Person person);

    //更新
    @Update("update person set person_name=#{personName},person_age=#{personAge},gender=#{gender},remark=#{remark}  where p_id=#{pId}")
    void update(Person person);

    //删除
    @Delete("delete from person where p_id=#{pId}")
    void delete(String pId);

    List<Person> selectPersonByName(String name);
}
