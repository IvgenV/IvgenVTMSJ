package Lesson4.clothes.pants;

public class PantsNike implements IPants{

    @Override
    public String putOn() {
            return "Nike pants dressed";
    }

    @Override
    public String takeoff() {
        return "Nike pants taken off";
    }

}
