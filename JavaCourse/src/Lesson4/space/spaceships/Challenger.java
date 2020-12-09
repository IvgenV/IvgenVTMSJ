package Lesson4.space.spaceships;

public class Challenger implements IStart {

    @Override
    public void startEngins() {
        System.out.println("\nChallenger's engines are running. All systems are OK");
    }

    @Override
    public void start() {
        System.out.println("Challenger start");
    }

}
