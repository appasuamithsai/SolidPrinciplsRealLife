package com.company;

/*  SRP(Single Responsibility Principle) */

//A class Should have only one reason to change

import com.company.model.*;

import java.util.ArrayList;
/*  SRP(Single Responsibility Principle) */

//A class Should have only one reason to change
public class User implements UserOps {

    ArrayList<UserData> list=new ArrayList<>();
    @Override
    public boolean login(UserData data) {
        // Login details fetching from the database checking they are valid or not
        if(data.getUser_name().equals("amith222") && data.getPassword().equals("1234")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean register(UserData data) {
        // if (email is valid) then storing into DB
        list.add(data);
        return true;
    }
}
