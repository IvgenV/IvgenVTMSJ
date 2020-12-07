package Lesson4.clothes.shoes;

public class ShoesReebok implements IShoes{

    @Override
    public String putOn() {
        return "Reebok sneakers dressed";
    }

    @Override
    public String takeoff() {
        return "Reebok sneakers removed";
    }

}
