package com.bridgelabz.userregistrationjunit;

import java.util.Scanner;

public class UserInformation {

    Scanner sc = new Scanner(System.in);
    ValidUserInformation validUserInformation = new ValidUserInformation();

    public String userFirstName() throws UserRegistrationException {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();
        return validUserInformation.firstName(firstName);
    }

    public String userLastName() throws UserRegistrationException {
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.next();
        return validUserInformation.lastName(lastName);
    }

    public String userEmailId() throws UserRegistrationException {
        System.out.println("Enter Your Email : ");
        String emailID = sc.next();
        return validUserInformation.emailId(emailID);
    }

    public String userMobNum() throws UserRegistrationException {
        System.out.println("Enter Your Mobile Number : ");
        String mobileNum = sc.next();
        return validUserInformation.mobNum(mobileNum);
    }

    public String userPassword() throws UserRegistrationException {
        System.out.println("Enter Your Password : ");
        String passWord = sc.next();
        return validUserInformation.password(passWord);
    }

}
