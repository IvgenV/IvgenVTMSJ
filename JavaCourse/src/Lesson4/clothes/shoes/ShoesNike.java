package Lesson4.clothes.shoes;

public class ShoesNike implements IShoes{

    @Override
    public String putOn() {
        return "Nike sneakers dressed";
    }

    @Override
    public String takeoff() {
        return "Nike sneakers removed";
    }

}
