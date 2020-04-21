package com.bl.demo;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public final String NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    public final String EMAIL_PATTERN = "^[0-9a-zA-Z]{1,}([._+-]{1}[a-zA-Z]+)?[@][0-9a-zA-Z]{1,}[.][a-z]{2,4}([.]{1}[a-z]{2})?$";
    public final String MOBILE_NO_PATTERN="^[0-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
    public final String PASSWORD_PATTERN = "^[a-zA-Z0-9]{8,}$";
    public final String PASSWORD_PATTERN1 = "^(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
    public final String PASSWORD_PATTERN2 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

    public boolean checkValidateName(String name) {
        return Pattern.matches(NAME_PATTERN,name);
    }

    public boolean checkValidateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN,email);
    }

    public boolean checkValidateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILE_NO_PATTERN,mobileNumber);
    }

    public boolean checkValidatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN,password);
    }

    public boolean checkValidatePassword1(String password) {
        return Pattern.matches(PASSWORD_PATTERN1,password);
    }

    public boolean checkValidatePassword2(String password) {
        return Pattern.matches(PASSWORD_PATTERN2,password);
    }
}
