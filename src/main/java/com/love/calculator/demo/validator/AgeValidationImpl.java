package com.love.calculator.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidationImpl implements ConstraintValidator<AgeValidator, Integer> {

    private int lower;
    private int upper;

    @Override
    public void initialize(AgeValidator age) {
        this.lower = age.lower();
        this.upper = age.upper();
    }
    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {

        if (age == null) {
            return false;
        }
        if (age < lower || age > upper) {
            return false;
        }
        return true;
    }
}
