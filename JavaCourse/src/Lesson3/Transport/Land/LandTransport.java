package Lesson3.Transport.Land;

import Lesson3.Transport.Transport;

public abstract class LandTransport extends Transport {

    private int wheels;
    private double fuelConsumption;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelconsumption() {
        return fuelConsumption;
    }

    public void setFuelconsumption(double fuel_consumption) {
        this.fuelConsumption = fuel_consumption;
    }

}
