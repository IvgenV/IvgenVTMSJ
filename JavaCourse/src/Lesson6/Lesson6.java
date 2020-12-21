package Lesson6;

public class Lesson6 {

    public static void main(String[] args) throws InterruptedException {
       carStarted();
    }

    public static void carStarted() throws InterruptedException {

        String[] brand = {"AUDI","BMW","FORD","MAZDA","HONDA","HYUNDAI","LADA","KIA","MERCEDES","VOLKSWAGEN","TOYOTA"};

        for (;;){

            int numberBrand = (int) (Math.random()*11);
            int speed = (int)(Math.random()*151)+100;
            int coast = (int)(Math.random()*80001)+20000;

            Car car = new Car(brand[numberBrand],speed,coast);
            Thread.sleep(1000);

            try {
                System.out.println(car.start() + " Brand " + brand[numberBrand] + " Speed " + speed + " Coast " + coast);
            } catch (CarExeption exception){
                System.out.println(exception.getMessage());
                System.out.println("number of error " + exception.getNumber());
            }
        }
    }
}
