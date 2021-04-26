package com.chegg.vk;

import java.util.Scanner;

public class Main {
	  private static final Vehicles vehs = new Vehicles();

	    private static boolean quit = false;

	    private static final Scanner input = new Scanner(System.in);

	    public static void main(String[] args) throws Exception {
	        int selection;

	        while (!quit) {

	            displayMenu();
	            selection = getSelection();
	            execute(selection);
	        }
	    }

	    private static void displayMenu() {
	        System.out.println(); // skip line
	        System.out.println("1 - Display All Vehicles");
	        System.out.println("2 - Display Available Vehicles");
	        System.out.println("3 - Reserve a Vehicle");
	        System.out.println("4 - Cancel a Reservation");
	        System.out.println("5 - Display Reservation");
	        System.out.println("6 - Add a Vehicle");
	        System.out.println("7 - Populate vehicles");
	        System.out.println("8 - Quit");
	        System.out.println();
	    }

	    private static int getSelection() {
	        int i;
	        do {
	            i = input.nextInt();
	            input.nextLine();
	        }
	        while (i > 8 || i < 1);

	        return i;
	    }

	    private static void execute(int selection) throws Exception {
	        System.out.println();

	        switch (selection) {
	            case 1:
	                displayAllVehicles();
	                break;

	            case 2:
	                displayAvailVehicles();
	                break;

	            case 3:
	                makeReservation();
	                break;

	            case 4:
	                cancelReservation();
	                break;

	            case 5:
	                displayReservation();
	                break;

	            case 6:
	                addVehicle();
	                break;

	            case 7:
	                populateVehicles(vehs);
	                break;

	            case 8:
	                quit = true;
	                break;
	        }
	    }

	    private static void displayAllVehicles() throws Exception {
	        vehs.reset();
	        System.out.println("ALL AGENCY VEHICLES");
	        while (vehs.hasNext()) {
	            System.out.println(vehs.getNextVehicle().toString());
	        }
	    }

	    private static void displayAvailVehicles() throws Exception {
	        System.out.println("AVAILABLE VEHICLES");
	        vehs.reset();
	        Vehicle v;
	        while (vehs.hasNext()) {
	            v = vehs.getNextVehicle();
	            if (!v.isResereved()) {
	                System.out.println(v.toString());
	            }
	        }
	    }

	    private static void makeReservation() throws VINNotFoundException {
	        String entered_VIN;
	        String entered_creditcard;
	        int entered_rentalperiod;
	        char YN_char;
	        boolean daily_insur_selected = false;

	        Vehicle veh = null;

	        System.out.println("Reservation Entry ...");

	        System.out.println("Enter VIN number to book vehicle: ");
	        entered_VIN = input.nextLine();

	        veh = vehs.getVehicle(entered_VIN);

	        if (veh != null) {
	            System.out.println(
	                    "Do you want to make reservation in 'D'(days)/'W'(weeks)/'M'(months), enter as it is in capital: ");

	            String unit = input.nextLine();
	            YN_char = unit.charAt(0);

	            System.out.println("For how many " + unit + " you want to reserve: ");
	            entered_rentalperiod = input.nextInt();
	            input.nextLine();

	            TimeSpan t = new TimeSpan(YN_char, entered_rentalperiod);

	            System.out.println("Do you want insurance enter(true/false): ");
	            daily_insur_selected = input.nextBoolean();
	            input.nextLine();

	            System.out.println("Enter your credit card number: ");
	            entered_creditcard = input.nextLine();

	            System.out.println(veh.toString());

	            Reservation r = new Reservation(entered_creditcard, t, daily_insur_selected);

	            veh.reserve(r);
	        }

	    }

	    private static void cancelReservation() throws VINNotFoundException {
	        System.out.println("Enter VIN number to cancel reservation: ");
	        String vin = input.nextLine();
	        Vehicle v = vehs.getVehicle(vin);

	        if (v != null) {
	            if (v.getReservation() == null) {
	                System.out.println("No reservation");
	                return;
	            }

	            String credit = v.getReservation().getCreditCardNum();
	            System.out.println("Enter your credit card number: ");
	            String entered_creditcard = input.nextLine();

	            if (credit.equals(entered_creditcard))
	                v.cancelReservation();
	            else
	                System.out.println("You entered wrong credit number, cannot cancel reservation. ");
	        }
	    }

	    private static void displayReservation() throws VINNotFoundException {
	        Vehicle v;

	        System.out.println("Display Reservation Entry ...");

	        System.out.println("Enter vehicle's VIN number: ");
	        String vin = input.nextLine();

	        v = vehs.getVehicle(vin);
	        if (v == null) {
	            System.out.println("No such vehicle exists");
	            return;
	        }

	        System.out.println();
	        System.out.println("RESERVATION INFORMATION");

	        if (v.getReservation() == null) {
	            System.out.println("No Reservation");
	            return;
	        }
	        System.out.println(v.getReservation().toString());

	    }

	    private static void addVehicle() {
	        String veh_descript;
	        String vin;
	        int mpg;
	        char YN_char;
	        int seatingCapacity;
	        int cargoCapacity;
	        int loadCapacity;

	        System.out.println("New Vehicle Entry ... \n");

	        System.out.println("Enter vehicle type you want to add, C(car)/S(SUV)/T(Truck), as it is (in capital): ");
	        String vehicletype = input.nextLine();
	        YN_char = vehicletype.charAt(0);

	        if (YN_char == 'C' || YN_char == 'S' || YN_char == 'T') {
	            System.out.println("Enter description (Name - model - year) for vehicle: ");
	            veh_descript = input.nextLine();

	            System.out.println("Enter mpg: ");
	            mpg = input.nextInt();
	            input.nextLine();

	            System.out.println("Enter VIN number: ");
	            vin = input.nextLine();

	            switch (YN_char) {
	                case 'C':
	                    System.out.println("Enter seating capacity: ");
	                    seatingCapacity = input.nextInt();
	                    input.nextLine();

	                    vehs.add(new Car(veh_descript, mpg, seatingCapacity, vin));
	                    break;

	                case 'S':
	                    System.out.println("Enter seating capacity: ");
	                    seatingCapacity = input.nextInt();
	                    input.nextLine();

	                    System.out.println("Enter cargo capacity (in cubic ft.): ");
	                    cargoCapacity = input.nextInt();
	                    input.nextLine();

	                    vehs.add(new SUV(veh_descript, mpg, seatingCapacity, cargoCapacity, vin));
	                    break;

	                case 'T':
	                    System.out.println("Enter load capacity(in lbs): ");
	                    loadCapacity = input.nextInt();
	                    input.nextLine();

	                    vehs.add(new Truck(veh_descript, mpg, loadCapacity, vin));
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        } else {
	            System.out.println("Wrong vehicle type");

	        }
	    }

	    private static void populateVehicles(Vehicles vehs) {
	        vehs.add(new Car("Chevrolet Camaro", 30, 2, "HK4GM4564GO"));
	        vehs.add(new Car("Ford Fusion", 34, 4, "AB4EG5689GM"));
	        vehs.add(new SUV("Honda Odyssey", 28, 7, 6, "VN9RE2635TD"));
	        vehs.add(new Truck("Ten", 12, 2810, "EJ5KU2437BC"));
	    }
}
