package owanbe.api.shared.models;

public class CreateTicketOrderRequest {
    private String email;
    private String paystackReference;
    private Event event;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaystackReference() {
        return paystackReference;
    }

    public void setPaystackReference(String paystackReference) {
        this.paystackReference = paystackReference;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

