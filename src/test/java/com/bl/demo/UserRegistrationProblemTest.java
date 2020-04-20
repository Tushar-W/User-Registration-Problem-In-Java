package com.bl.demo;

import org.junit.Assert;
import org.junit.BeforeClass;
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
}
