package com.tasks.entity;

import com.tasks.validator.NotBlackForOther;
import lombok.Data;

@Data
public class Person {
    private String personId;
    @NotBlackForOther(message = "aaaaaa")
    private String name;
    private Integer age;
    @NotBlackForOther(message = "bbbb")
    private String gender;
}
