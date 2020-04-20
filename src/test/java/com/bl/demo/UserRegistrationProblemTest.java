package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {
    @Test
    public void givenName_WhenValid_ShouldReturnTrue() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        Assert.assertTrue(userRegistrationProblem.checkValidateName("Tushar"));
    }
}
