package com.blz;

import com.bridgelabz.sll.user_registration_pp01.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class EmailIDTest {

    private String emailIds;
    private String expectedResult;

    public EmailIDTest(String emailIds, String expectedResult) {
        this.emailIds = emailIds;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection mailIdsExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", "Happy"},
                {"abc-100@yahoo.com", "Happy"},
                {"abc.100@yahoo.com", "Happy"},
                {"abc111@abc.com", "Happy"},
                {"abc-100@abc.net", "Happy"},
                {"abc.100@abc.com.au", "Happy"},
                {"abc@1.com", "Happy"},
                {"abc@gmail.com.com", "Happy"},
                {"abc+100@gmail.com", "Happy"},
                {"abc", "Sad"},
                {"abc@.com.my", "Sad"},
                {"abc123@gmail.a", "Sad"},
                {"abc123@.com", "Sad"},
                {"abc123@.com.com", "Sad"},
                {".abc@abc.com", "Sad"},
                {"abc()*@gmail.com", "Sad"},
                {"abc@%*.com", "Sad"},
                {"abc..2002@gmail.com", "Sad"},
                {"abc.@gmail.com", "Sad"},
                {"abc@abc@gmail.com", "Sad"},
                {"abc@gmail.com.1a", "Sad"},
                {"abc@gmail.com.aa.au", "Sad"},
        });
    }

    @Test
    public void TestEmailIds() throws UserRegistrationException {
        try {
            ValidUserInfoTest testEmail = new ValidUserInfoTest();
            //String result = testEmail.emailId(this.emailIds);
            Assert.assertEquals(this.expectedResult,this.emailIds);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID, e.type);
        }
    }

}
