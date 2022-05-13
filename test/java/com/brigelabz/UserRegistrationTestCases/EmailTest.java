package com.brigelabz.UserRegistrationTestCases;
import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegister;
import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailTest {
        private String email;
        private boolean expectedResult;

        public EmailTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

    /* Each parameter should be placed as an argument here
     * Every time runner triggers, it will pass the arguments
     * from parameters we defined in primeNumbers() method
     */
        @Parameterized.Parameters
        public static Collection emailIdsExpectedResult() {
            return Arrays.asList(new Object[][]{
                    { "abc@yahoo.com", true },
                    { "abc-100@yahoo.com", true },
                    { "abc.100@yahoo.com", true },
                    { "abc111@abc.com", true },
                    { "abc-100@abc.net", true },
                    { "abc.100@abc.com.au", true },
                    { "abc@1.com", true },
                    { "abc@gmail.com.com", true },
                    { "abc+100@gmail.com", true },
                    {"123abc@..gmail.com", false},
                    {"abc", false},
                    {"abc@.com.my",false},
                    {"abc123@gmail.a",false},
                    {"abc123@.com", false},
                    {"abc123@.com.com", false},
                    {".abc@abc.com",false},
                    {"abc()*@gmail.com", false},
                    {"abc@%*.com", false},
                    {"abc..2002@gmail.com", false},
                    {"abc.@gmail.com", false},
                    {"abc@abc@gmail.com", false},
                    {"abc@gmail.com.1a", false},
                    {"abc@gmail.com.aa.au", false}
            });
        }

        @Test
        public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() throws UserRegistrationException {
            UserRegister userRegister = new UserRegister();
            boolean result = userRegister.emailIdValidator(this.email);
            Assert.assertEquals(this.expectedResult, result);
        }
}
