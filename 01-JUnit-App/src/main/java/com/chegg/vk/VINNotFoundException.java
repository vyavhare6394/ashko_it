package com.chegg.vk;

public class VINNotFoundException extends Exception {
    public VINNotFoundException() {
        System.out.println("VIN not found");
    }
}