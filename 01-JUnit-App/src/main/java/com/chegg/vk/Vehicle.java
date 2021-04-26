package com.chegg.vk;

public class Vehicle {

	
	private final String description;
    private final int mpg;
    private final String vin;
    private Reservation resv;

    Vehicle(String description, int mpg, String vin) {
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        this.resv = null;
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

    public String toString() {
        String out;
        out = "" + description + " MPG: " + mpg + " VIN: " + vin;
        return out;
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
	
	
}
