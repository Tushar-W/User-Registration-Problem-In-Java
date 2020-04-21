package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidateName("Tushar"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidateName("Tu"));
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidateName("Wankhede"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidateName("Wa"));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidateEmail("a@.com"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidateMobileNumber("91 9561782554"));
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidateMobileNumber("9988776556"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidatePassword("123abc45ff"));
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidatePassword("123abc@45ff"));
    }

    @Test
    public void givenPassword_WhenAtLeastOneUpperCase_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidatePassword1("Abc45f"));
    }

    @Test
    public void givenPassword_WhenNotAtLeastOneUpperCase_ShouldReturnFalse() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertFalse(userRegistrationProblem.checkValidatePassword1("abc45ff"));
    }

    @Test
    public void givenPassword_WhenAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidatePassword2("Abc456ff"));
    }
}
