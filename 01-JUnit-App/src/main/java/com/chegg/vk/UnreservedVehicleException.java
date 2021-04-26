package com.chegg.vk;

public class UnreservedVehicleException extends Exception {
    public UnreservedVehicleException() {
        System.out.println("Vehicle is reserved");
    }
}