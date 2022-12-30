package owanbe.api.shared.models;

import java.math.BigDecimal;

public class Paystack {
    private BigDecimal pricePerTicket;
    private BigDecimal priceInTotal;
    private String reference;

    public BigDecimal getPricePerTicket() {
        return pricePerTicket;
    }

    public void setPricePerTicket(BigDecimal pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public BigDecimal getPriceInTotal() {
        return priceInTotal;
    }

    public void setPriceInTotal(BigDecimal priceInTotal) {
        this.priceInTotal = priceInTotal;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
