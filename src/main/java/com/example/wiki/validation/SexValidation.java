package com.example.wiki.validation;

import com.example.wiki.anno.Sex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SexValidation implements ConstraintValidator<Sex, String> {
    @Override
    public void initialize(Sex constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null){
            return false;
        }
        else return value.equals("男") || value.equals("女");
    }
}
