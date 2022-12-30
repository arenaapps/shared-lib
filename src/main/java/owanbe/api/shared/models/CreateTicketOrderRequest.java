package owanbe.api.shared.models;

public class CreateTicketOrderRequest {
    private String email;
    private String paystackReference;
    private Paystack paystack;
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

    public Paystack getPaystack() {
        return paystack;
    }

    public void setPaystack(Paystack paystack) {
        this.paystack = paystack;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

