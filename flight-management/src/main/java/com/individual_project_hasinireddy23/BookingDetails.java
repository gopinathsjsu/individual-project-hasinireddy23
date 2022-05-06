package com.individual_project_hasinireddy23;

public class BookingDetails {
    private String name;
    private String flightNo;
    private int noOfSeats;
    private String category;
    private String cardNo;

    public BookingDetails(String name, String flightNo, String category, int seats, String cardNo) {
        this.name = name;
        this.flightNo = flightNo;
        this.noOfSeats = seats;
        this.category = category;
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public String getFlightNum() {
        return flightNo;
    }

    public String getCategory() {
        return category;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getCardNo() {
        return cardNo;
    }
}
