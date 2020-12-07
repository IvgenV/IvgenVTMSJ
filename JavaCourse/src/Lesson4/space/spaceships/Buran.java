package Lesson4.space.spaceships;

public class Buran implements IStart {

    @Override
    public void startEngins() {
        System.out.println("\nBuran's engines are running. All systems are OK");
    }

    @Override
    public void start() {
        System.out.println("Buran start");
    }

}
