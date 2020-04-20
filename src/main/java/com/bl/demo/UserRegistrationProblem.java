package com.bl.demo;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public final String NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";

    public boolean checkValidateName(String name) {
        return Pattern.matches(NAME_PATTERN,name);
    }
}
