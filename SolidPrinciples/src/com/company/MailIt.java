package com.company;

import com.company.model.*;
/*  SRP(Single Responsibility Principle) */

//A class Should have only one reason to change
public class MailIt implements Email {
    @Override
    public boolean sendEmail(UserData data, String details) {
        //send mail to data.email the detalis
        return true;
    }
}
