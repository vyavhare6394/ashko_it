package com.chegg.vk;

class Truck extends Vehicle {
    private final int loadCapacity;
    private final String description;
    private final int mpg;
    private final String vin;
    private Reservation resv;

    public Truck(String description, int mpg, int loadCapacity, String vin) {
        super(description, mpg, vin);
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        this.resv = null;
        this.loadCapacity = loadCapacity;
    }

    public int loadCapacity() {
        return loadCapacity();
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
        out = this.description + "-foot (Truck) MPG: " + this.mpg + " Load capacity: " + this.loadCapacity + " VIN: "
                + this.vin;
        return out;
    }
}