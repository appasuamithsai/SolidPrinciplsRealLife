package com.company.model;

public class UserData {
    private String email,password,user_name;

    public UserData(String email,  String user_name,String password) {
        this.email = email;
        this.password = password;
        this.user_name = user_name;
    }

    public UserData( String user_name,String password) {
        this.password = password;
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
