package Lesson4.robots.hands;

public class ToshibaHand implements IHand {

    int price;

    public ToshibaHand(int price){
        this.price = price;
    }

    @Override
    public void moveHand(){
        System.out.println("Поднимается рука Toshiba");
    }

    @Override
    public int getHandPrice() {
        return price;
    }


}
