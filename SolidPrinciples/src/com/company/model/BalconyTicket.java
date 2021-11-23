package com.company.model;
/* LSV (Liskov Substitution Principle) */
//derived types must be completely substitutable for there base class
/* DIP */
// high level modules must not depend on low level modules they both should depend on abstraction
public class BalconyTicket extends Ticket{
    public BalconyTicket(int ticket_id, String ticket_details) {
        super(ticket_id, ticket_details);
    }

    @Override
    public int getTicketPrice() {
        return 100;
    }
}
