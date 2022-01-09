package com.blz;

import com.bridgelabz.sll.user_registration_pp01.UserRegistrationException;
import com.bridgelabz.sll.user_registration_pp01.ValidUserInformation;
import org.junit.Assert;
import org.junit.Test;

public class ValidUserInfoTest {

    ValidUserInformation validUserInformation = new ValidUserInformation();

    @Test
    public void firstNameValid() throws UserRegistrationException {
        try {
            String expectedVal = "Happy";
            String actualResult = validUserInformation.firstName("Mukul");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void firstNameInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validUserInformation.firstName("mukul");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validUserInformation.lastName("Jain");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validUserInformation.lastName("jain");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validUserInformation.emailId("mukul.jain@sample.com");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validUserInformation.emailId("mukul.jain.co.in");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validUserInformation.mobNum("54-5465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validUserInformation.mobNum("54-55465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validUserInformation.password("ab98cDE@&fg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validUserInformation.password("ab98cDEfg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
}
