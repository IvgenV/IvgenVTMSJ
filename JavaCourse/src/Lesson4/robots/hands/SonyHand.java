package Lesson4.robots.hands;

public class SonyHand implements IHand {

    int price;

    public SonyHand(int price){
        this.price = price;
    }

    @Override
    public void moveHand(){
        System.out.println("Поднимметс рука Sony");
    }

    @Override
    public int getHandPrice() {
        return price;
    }
}
