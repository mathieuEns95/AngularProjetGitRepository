package com.iit.framework_web.config.validators;

import com.iit.framework_web.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.CustomValidatorBean;

//@Component("afterCreateUserValidator")
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        CustomValidatorBean v = new CustomValidatorBean();
        v.validate(o, errors);
        System.out.println(errors);
    }
}
