package Lesson4.сlothes.jackets;

public class JacketAdidas implements IJacket {

    @Override
    public String putn() {
        return "Куртка Adidas одета";
    }

    @Override
    public String takeoff() {
        return "Куртка Adidas снята";
    }
}
