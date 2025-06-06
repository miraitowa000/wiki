package com.example.wiki.anno;

import com.example.wiki.validation.SexValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SexValidation.class})
public @interface Sex {
    String message() default "性别只能是男或女";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
