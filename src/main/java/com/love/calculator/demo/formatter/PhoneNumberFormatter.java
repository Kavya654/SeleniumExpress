package com.love.calculator.demo.formatter;

import com.love.calculator.demo.entity.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

        System.out.println("inside parse method");
        String[] phoneNumberArray = completePhoneNumber.split("-");
        Phone phone = new Phone();
        phone.setCountryCode(phoneNumberArray[0]);
        phone.setUserNumber(phoneNumberArray[1]);

        return phone;

    }
    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
