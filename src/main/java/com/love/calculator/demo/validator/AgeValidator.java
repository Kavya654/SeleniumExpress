package com.love.calculator.demo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidationImpl.class)
public @interface AgeValidator {

    int lower() default 18;
    int upper() default 60;
    String message() default "Age should not cross {lower} and {upper}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
