package com.company.model;
/* Open / closed principle */
//This class is open for extension and closed fo modification

public abstract class Ticket {
        int ticket_id;
        String ticket_details;

    public Ticket(int ticket_id, String ticket_details) {
        this.ticket_id = ticket_id;
        this.ticket_details = ticket_details;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_details() {
        return ticket_details;
    }

    public void setTicket_details(String ticket_details) {
        this.ticket_details = ticket_details;
    }

   public abstract int getTicketPrice();
}
