package Lesson7;

import java.io.Serializable;

public class CarSerializable implements Serializable {

    private String brand;
    private int speed;
    private int coast;

    public CarSerializable(String brand,int speed,int coast){
        this.brand = brand;
        this.speed = speed;
        this.coast = coast;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }
}
