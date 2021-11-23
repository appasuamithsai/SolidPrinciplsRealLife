package com.company.model;
/* LSV (Liskov Substitution Principle) */
//derived types must be completely substitutable for there base class
/* DIP */
// high level modules must not depend on low level modules they both should depend on abstraction
public class BoxTicket  extends Ticket implements Discount{
    public BoxTicket(int ticket_id, String ticket_details) {
        super(ticket_id, ticket_details);
    }

    @Override
    public int getTicketPrice() {
        return 300-cal_discount(300);
    }

    @Override
    public int cal_discount(int price) {
        double v = 0.3 * price;
        return (int)v;
    }
}
