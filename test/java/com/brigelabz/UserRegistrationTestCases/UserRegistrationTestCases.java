package com.brigelabz.UserRegistrationTestCases;

import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegister;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCases {

    UserRegister userRegister = new UserRegister();


    /*
     * givenFirstNameShouldBeValidTestCase created to validate first name is true or false.
     */
    @Test
    public void givenFirstNameShouldBeValidTestCase(){
        boolean valid = userRegister.isValidFirstName("Sanjana");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void givenFirstNameShouldBeInValidTestCase(){
        boolean valid = userRegister.isValidFirstName("sanjana");
        Assert.assertEquals(false,valid);
    }
}
