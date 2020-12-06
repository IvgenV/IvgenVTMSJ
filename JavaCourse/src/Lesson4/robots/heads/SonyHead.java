package Lesson4.robots.heads;

public class SonyHead implements IHead {

    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getHeadPrice() {
        return price;
    }

}
