package com.tasks.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotBlackForOtherValidator implements ConstraintValidator<NotBlackForOther,String> {
    private int i=0;
    @Override
    public void initialize(NotBlackForOther constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        i++;
        System.out.println("当前的value值是:"+value+"    "+i);
        return true;
    }
}
