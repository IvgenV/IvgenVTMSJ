package Lesson4.robots.legs;

public class SonyLeg implements ILeg{

    int price;

    public SonyLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Sony feet walking");
    }

    @Override
    public int getLegPrice() {
        return price;
    }
}
