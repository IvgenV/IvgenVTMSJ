package Lesson4.robots.legs;

public class SamsungLeg implements ILeg{

    int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Samsung feet walking");
    }

    @Override
    public int getLegPrice() {
        return price;
    }
}
