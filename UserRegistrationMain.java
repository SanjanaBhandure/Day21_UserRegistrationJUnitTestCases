/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry with validate Test Cases.
 * UC11: Write JUnit Parameterised Test to validate multiple entry for the Email Address.
 *
 * @author: Sanjana Bhandure
 * @version: 1.10
 * @date: 2-05-2022
 */

package com.Bridgelabz.Day21_UserRegistrationProblem;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        // method calling to check whether the name is written in proper way or not.
        System.out.println(UserRegister.isValidFirstName(firstName));

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(UserRegister.isValidLastName(lastName));

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println(UserRegister.emailIdValidator(email));

        System.out.println("Enter phone Number with country code(space between country code and phone Number): ");
        String phoneNumber = scanner.nextLine();
        System.out.println(UserRegister.isValidPhoneNumber(phoneNumber));

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        System.out.println(UserRegister.isValidPassword(password));
    }
}

