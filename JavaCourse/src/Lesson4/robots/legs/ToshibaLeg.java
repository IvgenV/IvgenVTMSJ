package Lesson4.robots.legs;

public class ToshibaLeg implements ILeg{

    int price;

    public ToshibaLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getLegPrice() {
        return price;
    }
}
