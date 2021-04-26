package com.chegg.vk;

public class Car extends Vehicle {
    private final int seatingCapacity;
    private final String description;
    private final int mpg;
    private final String vin;
    private Reservation resv;

    public Car(String description, int mpg, int seatingCapacity, String vin) {
        super(description, mpg, vin);
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        this.resv = null;
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public int getMpg() {
        return this.mpg;
    }

    public String getVin() {
        return this.vin;
    }

    public Reservation getReservation() {

        return this.resv;

    }

    public boolean isResereved() {
        return resv != null;
    }

    public void reserve(Reservation r) {
        this.resv = r;
    }

    public void cancelReservation() {
        try {
            if (resv == null) {
                throw new UnreservedVehicleException();
            } else
                this.resv = null;
        } catch (Exception e) {
            System.out.println();
        }
    }

    public String toString() {
        String out;
        out = this.description + " (CAR) MPG: " + this.mpg + " Seating: " + this.seatingCapacity + " VIN: " + this.vin;
        return out;
    }
}