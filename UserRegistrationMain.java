/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry with validate Test Cases.
 * UC1: As a User need to enter a valid First Name.
 *
 * @author: Sanjana Bhandure
 * @version: 1.0
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
    }
}

