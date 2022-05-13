package com.brigelabz.UserRegistrationTestCases;

import com.Bridgelabz.Day21_UserRegistrationProblem.MoodAnalyser;
import com.Bridgelabz.Day21_UserRegistrationProblem.MoodAnalyserException;
import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegister;
import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTestCases {
        UserRegister userRegister = new UserRegister();

/*
    givenFirstNameShouldBeValidTestCase created to validate first name is true or false.
*/
    @Test
    public void givenFirstNameShouldBeValidTestCase() {
        boolean firstName = false;
        try {
            firstName = UserRegister.isValidFirstName("Sanjana");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(firstName);
    }

/*
    givenLastNameShouldBeValidTestCase created to validate last name is true or false.
*/
    @Test
    public void givenLastNameShouldBeValidTestCase() {
        boolean lastName = false;
        try {
            lastName = UserRegister.isValidLastName("Bhandure");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(lastName);
    }

/*
    givenEmailShouldBeValidTestCase created to validate email.
*/
     @Test
     public void givenEmailShouldBeValidTestCase() throws UserRegistrationException {
         boolean email = userRegister.isValidEmail("abc@gmail.com");
         Assertions.assertTrue(email);
     }

/*
     givenMobileNumberShouldBeValidTestCase created to validate mobile number.
*/
    @Test
    public void givenMobileNumberShouldBeValidTestCase() throws UserRegistrationException {
        boolean phoneNumber = userRegister.isValidPhoneNumber("91 9900000000");
        Assertions.assertTrue(phoneNumber);
    }

/*
    givenPasswordShouldBeValidTestCase created to validate password
*/
    @Test
    public void givenPasswordShouldBeValidTestCase() throws UserRegistrationException {
        boolean password = userRegister.isValidPassword("abcdAadg");
        Assert.assertTrue(true);
    }

    @Test
    public void givenPasswordShouldBeInValidTestCase() {
        boolean password = false;
        try {
            password = UserRegister.isValidFirstName("AbcdAadg");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(true);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean password = false;
        try {
            password = UserRegister.isValidFirstName("AbcdAadg");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(true);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue() {
        boolean password = false;
        try {
            password = UserRegister.isValidFirstName("AbcdE1234");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(true);
    }

    @Test
    public void  givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue(){
        boolean password = false;
        try {
            password = UserRegister.isValidFirstName("ABCabcB123#");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase1() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc@yahoo.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc@yahoo.com",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase2() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc-100@yahoo.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc-100@yahoo.com",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase3() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc111@abc.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc111@abc.com",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase4() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc-100@abc.net");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc-100@abc.net",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase5() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc.100@abc.com.au");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc.100@abc.com.au",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase6() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc@1.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc@1.com",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase7() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc@gmail.com.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc@gmail.com.com",true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueTestCase8() {
        boolean email = false;
        try {
            email = UserRegister.isValidFirstName("abc@abc+100@gmail.com");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue("abc@abc+100@gmail.com",true);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() throws MoodAnalyserException {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() throws MoodAnalyserException {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}
