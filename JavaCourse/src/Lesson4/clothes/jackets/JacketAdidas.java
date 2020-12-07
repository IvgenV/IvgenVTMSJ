package Lesson4.clothes.jackets;

public class JacketAdidas implements IJacket {

    @Override
    public String putOn() {
        return "Adidas Jacket Dressed";
    }

    @Override
    public String takeoff() {
        return "Adidas jacket stripped";
    }
}
