package com.company;

import java.util.Scanner;

public class RoutePlannerFacade {

    TimeFormatStrategy timeFormatStrategy;

    public void calculateRoute() {
        /*Create route*/
        int distance = 500;

        /*Asks for user input*/
        System.out.println("Would you like to use a car or a bicycle to cover " + distance + "m?");
        Scanner inputReader = new Scanner(System.in);
        String vehicleString = inputReader.next();

        /*Creates vehicle*/
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.CreateVehicle(vehicleString);

        /*Check time format*/
        if(vehicle instanceof Car) {
            this.timeFormatStrategy = new SecondsStrategy();
        } else if(vehicle instanceof Bicycle) {
            this.timeFormatStrategy = new MinutesStrategy();
        }

        /*Print output*/
        float time = vehicle.calculateTime(distance);
        this.timeFormatStrategy.printTime(time, distance);
    }
}
