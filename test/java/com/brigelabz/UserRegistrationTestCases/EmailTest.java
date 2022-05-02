package com.brigelabz.UserRegistrationTestCases;
import com.Bridgelabz.Day21_UserRegistrationProblem.UserRegister;
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
                    { "abc+100@gmail.com", true }

            });
        }

        @Test
        public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
            UserRegister userRegister = new UserRegister();
            boolean result = userRegister.emailIdValidator(this.email);
            Assert.assertEquals(this.expectedResult, result);
        }
}
