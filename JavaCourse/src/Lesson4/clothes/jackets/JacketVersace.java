package Lesson4.clothes.jackets;

public class JacketVersace implements IJacket{

    @Override
    public String putOn() {
        return "Versace Jacket Dressed\n";
    }

    @Override
    public String takeoff() {
        return "Versace jacket stripped";
    }
}
