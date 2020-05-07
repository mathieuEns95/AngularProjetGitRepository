package com.iit.framework_web.config.validators;


import com.iit.framework_web.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterConvertEvent;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.CustomValidatorBean;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.Set;

@Component
public class ValidatorComponent extends AbstractMongoEventListener<User> {

    @Autowired
    private Validator validator;


    @Override
    public void onBeforeSave(BeforeSaveEvent<User> event) {
        Set<ConstraintViolation<User>> validate = validator.validate(event.getSource());
        if (!validate.isEmpty()) {
            throw new ConstraintViolationException(validate);
        }
    }
}
