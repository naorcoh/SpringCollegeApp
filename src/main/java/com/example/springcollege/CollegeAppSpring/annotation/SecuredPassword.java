package com.example.springcollege.CollegeAppSpring.annotation;

import com.example.springcollege.CollegeAppSpring.validations.SecuredPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = SecuredPasswordValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SecuredPassword {


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "Password should be stronger!";
}
