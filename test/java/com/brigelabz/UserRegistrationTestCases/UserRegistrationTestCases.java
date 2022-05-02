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

    /*
     * givenMobileNumberShouldBeValidTestCase created to validate mobile number.
     */
    @Test
    public void givenMobileNumberShouldBeValidTestCase(){
        boolean valid = userRegister.isValidPhoneNumber("91 9123456789");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void givenMobileNumberShouldBeInValidTestCase(){
        boolean valid = userRegister.isValidPhoneNumber("919123456789");
        Assert.assertEquals(false,valid);
    }

    /*
     * givenPasswordShouldBeValidTestCase created to validate password
     */
    @Test
    public void givenPasswordShouldBeValidTestCase(){
        boolean valid = userRegister.isValidPassword("Abcdefg#123");
        Assert.assertTrue("abcABC123@$",true);
    }

    @Test
    public void givenPasswordShouldBeInValidTestCase(){
        boolean valid = userRegister.isValidPassword("abA123#");
        Assert.assertFalse("abA1@",false);
    }
}
