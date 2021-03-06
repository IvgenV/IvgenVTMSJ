package Lesson3.Transport.Land;

import java.util.Objects;

public class PassengerCar extends LandTransport {

    private String typebody;
    private int numberpassengers;
    private double time;

    private double carFuelConsumption(){
        return carDistance()/100* getFuelconsumption();
    }

    private double carDistance(){
        return time * getMaxspeed();
    }

    public PassengerCar(double time){
        this.time = time;
    }

    public String getTypebody() {
        return typebody;
    }

    public void setTypebody(String typebody) {
        this.typebody = typebody;
    }

    public int getNumberpassengers() {
        return numberpassengers;
    }

    public void setNumberpassengers(int numberpassengers) {
        this.numberpassengers = numberpassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return numberpassengers == that.numberpassengers && typebody.equals(that.typebody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typebody, numberpassengers);
    }

    @Override
    public String toString(){
        return "During " + time + " hour, car " + getBrand() + " moving at maximum speed " +
                getMaxspeed() + " km in hour, will pass " + carDistance() + " km, and will use up " +  carFuelConsumption() +
                " liters of fuel";
    }

    public Double Kilowatts(){
        return getPower() * 0.74;
    }

}
