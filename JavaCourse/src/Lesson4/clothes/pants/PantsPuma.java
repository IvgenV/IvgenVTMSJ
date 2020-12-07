package Lesson4.clothes.pants;

public class PantsPuma implements IPants{

    @Override
    public String putOn() {
        return "Puma pants dressed";
    }

    @Override
    public String takeoff() {
        return "Puma pants taken off";
    }

}
