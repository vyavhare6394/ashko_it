package com.chegg.vk;

public class SUV extends Vehicle {
    private final int seatingCapacity;
    private final int cargoCapacity;
    private final String description;
    private int mpg;
    private String vin;
    private Reservation resv;

    public SUV(String description, int mpg, int seatingCapacity, int cargoCapacity, String vin) {
        super(description, mpg, vin);
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        this.resv = null;
        this.seatingCapacity = seatingCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public int cargoCapacity() {
        return this.cargoCapacity;
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
        return this.resv != null;
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
        out = this.description + " (SUV) MPG: " + this.mpg + " Seating: " + this.seatingCapacity + " Storage: "
                + this.cargoCapacity + " VIN: " + this.vin;
        return out;
    }
}