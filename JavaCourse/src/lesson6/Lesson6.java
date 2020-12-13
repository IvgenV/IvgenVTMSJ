package lesson6;

public class Lesson6 {

    public static void main(String[] args){
       carStarted();
    }

    public static void carStarted(){
        Car car1 = new Car("AUDI",260,45000);
        Car car2 = new Car("BMW",320,65000);

        try {
            System.out.println(car1.start());
            System.out.println(car2.start());
        } catch (CarExeption exception){
            System.out.println(exception.getMessage());
            System.out.println("number of error " + exception.getNumber());
        }
    }

}
