package Lesson6;

public class CarExeption extends Exception{

    private int number;

    public int getNumber() {
        return number;
    }

    public CarExeption(String message,int number){
        super(message);
        this.number = number;
    }
}
