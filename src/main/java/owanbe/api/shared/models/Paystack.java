package owanbe.api.shared.models;

public class Paystack {
    private String pricePerTicket;
    private String priceInTotal;

    public String getPricePerTicket() {
        return pricePerTicket;
    }

    public void setPricePerTicket(String pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public String getPriceInTotal() {
        return priceInTotal;
    }

    public void setPriceInTotal(String priceInTotal) {
        this.priceInTotal = priceInTotal;
    }
}
