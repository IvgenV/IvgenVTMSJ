package Lesson6;

public class Car {

    private String brand;
    private int speed;
    private int price;

    public Car(){

    }

    public Car(String brand,int speed,int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String start() throws CarExeption {
        int random  = (int)(Math.random()*21);
        if (random%2==0) throw new CarExeption("Number is even", random);
        return "Car started up";
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
