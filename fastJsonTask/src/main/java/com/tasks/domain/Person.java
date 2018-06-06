package com.tasks.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private String pId;
    @JSONField(serialzeFeatures = {SerializerFeature.WriteMapNullValue},name = "Na5me")
    private String name;
    private int age;
    /**
     * 隐藏该项
     */
    @JSONField(serialize = false)
    private String remark;
    private String gender;
    /**
     * 格式化并且定义别名
     * 排序
     */
    @JSONField(name = "create_date",format = "yyyy-MM-dd HH:mm:ss",ordinal = 1)
    private Date createDate;
    private Address address;
}
