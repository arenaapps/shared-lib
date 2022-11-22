package owanbe.api.shared.models;

public class TicketRequest {
    private String ticketTypeRef;
    private String ticketTypeName;
    private int ticketQuantity;

    public String getTicketTypeRef() {
        return ticketTypeRef;
    }

    public void setTicketTypeRef(String ticketTypeRef) {
        this.ticketTypeRef = ticketTypeRef;
    }

    public String getTicketTypeName() {
        return ticketTypeName;
    }

    public void setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }
}
