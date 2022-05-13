package com.example.garageSystembackend.model;

public class Truck extends Vehicle {
    public Truck(String modelName, String licenseNumber, int powerLeft, double maxTirePressure) {
        super(modelName, licenseNumber, powerLeft, maxTirePressure);
        Wheel[] WheelsArray = new Wheel[16]; //creating array of wheels and setting the tires pressure to max.
        for(int i = 0; i < WheelsArray.length; i++) {
            WheelsArray[i] = new Wheel(maxTirePressure);
        }
        this.setWheelsArray(WheelsArray);
    }
}



