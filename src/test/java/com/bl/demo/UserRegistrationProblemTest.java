package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {
    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(userRegistrationProblem.checkValidateName("Tushar"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(userRegistrationProblem.checkValidateName("Tu"));
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(userRegistrationProblem.checkValidateName("Wankhede"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(userRegistrationProblem.checkValidateName("Wa"));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(userRegistrationProblem.checkValidateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        Assert.assertFalse(userRegistrationProblem.checkValidateEmail("a@.com"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(userRegistrationProblem.checkValidateMobileNumber("91 9561782554"));
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        Assert.assertFalse(userRegistrationProblem.checkValidateMobileNumber("9988776556"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(userRegistrationProblem.checkValidatePassword("tushar@95Barca"));
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        Assert.assertFalse(userRegistrationProblem.checkValidatePassword("tushar95Barca"));
    }
}
