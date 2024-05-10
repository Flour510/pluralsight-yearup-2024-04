package com.pluralsight;

public class Reservation {
    final double kingPricePerNight = 139.00;
    final double doublePricePerNight = 124.00;
    final double weekendAdditionalPrice = 1.10;

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        calculatePricePerNight();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        calculatePricePerNight();
    }

    public double getPrice() {
        return numberOfNights * calculatePricePerNight();
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
        calculatePricePerNight();
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
        calculatePricePerNight();
    }

    private double calculatePricePerNight() {
        double basePrice;
        switch (roomType.toLowerCase()) {
            case "king":
                basePrice = kingPricePerNight;
                break;
            case "double":
                basePrice = doublePricePerNight;
                break;
            default:
                basePrice = 0.0;
        }

        if (isWeekend) {
            basePrice += basePrice * weekendAdditionalPrice;
        }
        return basePrice;
    }
}