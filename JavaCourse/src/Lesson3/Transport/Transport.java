package Lesson3.Transport;

import java.util.Objects;

public abstract class Transport {

    private int power;
    private int maxspeed;
    private int weight;
    private String brand;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return power == transport.power && maxspeed == transport.maxspeed && weight == transport.weight && brand.equals(transport.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, maxspeed, weight, brand);
    }
}
