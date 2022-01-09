package com.bridgelabz.userregistrationjunit;

public class UserRegistrationRegex {

    public static void main(String args[]) throws UserRegistrationException{
        UserInformation userInformation = new UserInformation();

        System.out.println(userInformation.userFirstName());
        System.out.println(userInformation.userLastName());
        System.out.println(userInformation.userEmailId());
        System.out.println(userInformation.userMobNum());
        System.out.println(userInformation.userPassword());
    }

}
