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

    /*
     * givenLastNameShouldBeValidTestCase created to validate last name is true or false.
     */
    @Test
    public void givenLastNameShouldBeValidTestCase(){
        boolean valid = userRegister.isValidLastName("Bhandure");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void givenLastNameShouldBeInValidTestCase(){
        boolean valid = userRegister.isValidLastName("bhandure");
        Assert.assertEquals(false,valid);
    }

    /*
     * givenEmailShouldBeValidTestCase created to validate email.
     */
    @Test
    public void givenEmailShouldBeValidTestCase(){
        boolean valid = userRegister.isValidEmail("abc@gmail.com");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void givenEmailShouldBeInValidTestCase(){
        boolean valid = userRegister.isValidEmail("ab_c@");
        Assert.assertEquals(false,valid);
    }
}
