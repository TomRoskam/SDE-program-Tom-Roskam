package com.company;

import java.util.Objects;

public class VehicleFactory {

    public Vehicle CreateVehicle(String vehicleString) {
        if (Objects.equals(vehicleString, "car")) {
            return new Car();
        } else if (Objects.equals(vehicleString, "bicycle")){
            return new Bicycle();
        } else {
            return new Bicycle();
        }
    }
}
