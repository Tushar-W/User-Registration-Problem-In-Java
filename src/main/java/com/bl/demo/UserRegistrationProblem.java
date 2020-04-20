package com.bl.demo;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";

    public boolean checkValidateName(String name) {
        return Pattern.matches(FIRST_NAME_PATTERN,name);
    }
}
