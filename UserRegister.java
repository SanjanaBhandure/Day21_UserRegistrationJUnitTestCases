package com.Bridgelabz.Day21_UserRegistrationProblem;

import java.util.regex.Pattern;

public class UserRegister {
    /*
     * isValidFirstName method created in which First Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
    }
}
