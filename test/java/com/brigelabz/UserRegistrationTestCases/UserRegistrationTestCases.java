package com.brigelabz.UserRegistrationTestCases;

import com.Bridgelabz.Day21_UserRegistrationProblem.MoodAnalyser;
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

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("abc1234@df1");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("ABCabc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("abcAFG$%");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("ABCabcB123#");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegister.isValidPassword("abcAOP123");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegister.isValidEmail("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc()*@gmail.com");
        Assert.assertFalse("abc()*@gmail.com",false);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegister.isValidEmail("abc.100@abc.com.au");
        Assert.assertFalse("abc.100@abc.com.au",false);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc()*@gmail.com");
        Assert.assertFalse("abc()*@gmail.com",false);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc123@gmail.a –");
        Assert.assertFalse("abc123@gmail.a –",false);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc123@.com");
        Assert.assertFalse("abc123@.com",false);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail(".abc@abc.com");
        Assert.assertFalse(".abc@abc.com",false);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc.@gmail.com –");
        Assert.assertFalse("abc.@gmail.com –",false);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc@abc@gmail.com");
        Assert.assertFalse("abc@abc@gmail.com",false);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegister.isValidEmail("abc..2002@gmail.com");
        Assert.assertFalse("abc..2002@gmail.com",false);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}
