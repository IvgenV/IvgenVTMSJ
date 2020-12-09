package Lesson4.space.spaceships;


public class Shuttle implements IStart {

    @Override
    public void startEngins() {
        System.out.println("\nShuttle engines are running. All systems are OK");
    }

    @Override
    public void start() {
        System.out.println("Shuttle Launch");
    }
}
