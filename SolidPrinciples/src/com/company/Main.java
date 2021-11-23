package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        User amith=new User();
        amith.register(new UserData("appasu.amithsai@gmail.com","amith222","1234"));
        if(amith.login(new UserData("amith222","1234"))){
            System.out.println("USer Logged In!!!");
            Ticket movieTicket=new BoxTicket(1,"Box Ticket");
            System.out.println("Pls pay "+movieTicket.getTicketPrice()+" for "+movieTicket.getTicket_details());

        }else{
            System.out.println("User Login Failed!!!");
        }
    }
}