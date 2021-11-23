package com.company.model;
/* Interface Segregation Principle */
////No client should  be forced to depend on methods it does not use 
public interface Email{
    boolean sendEmail(UserData data,String details);
}
