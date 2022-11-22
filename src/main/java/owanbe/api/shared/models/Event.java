package owanbe.api.shared.models;

import java.util.List;

public class Event {
    private String eventRef;
    private String eventTitle;
    private String eventVenue;
    private String eventDate;
    private String eventTime;
    private List<TicketRequest> tickets;

    public String getEventRef() {
        return eventRef;
    }

    public void setEventRef(String eventRef) {
        this.eventRef = eventRef;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public List<TicketRequest> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketRequest> tickets) {
        this.tickets = tickets;
    }
}
