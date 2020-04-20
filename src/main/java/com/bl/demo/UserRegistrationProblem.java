package com.bl.demo;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public final String NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    public final String EMAIL_PATTERN = "^[0-9a-zA-Z]{1,}([._+-]{1}[a-zA-Z]+)?[@][0-9a-zA-Z]{1,}[.][a-z]{2,4}([.]{1}[a-z]{2})?$";

    public boolean checkValidateName(String name) {
        return Pattern.matches(NAME_PATTERN,name);
    }

    public boolean checkValidateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN,email);
    }
}
