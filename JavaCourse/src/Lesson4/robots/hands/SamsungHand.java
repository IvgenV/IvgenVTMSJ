package Lesson4.robots.hands;

public class SamsungHand implements IHand {

    int price;

    public SamsungHand(int price){
        this.price = price;
    }

    @Override
    public void moveHand(){
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getHandPrice() {
        return price;
    }

}
