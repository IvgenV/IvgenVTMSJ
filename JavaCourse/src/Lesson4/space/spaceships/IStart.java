package Lesson4.space.spaceships;

public interface IStart {

    default boolean systemCheck() throws InterruptedException{
        int random = (int) (Math.random()*11);
        if(random>3){
            for(int i=0;i<=random;i++){
                System.out.print(i + " ");
                Thread.sleep(500);
            }
            return true;
        }else{
            for(int i=0;i<=random;i++){
                System.out.print(i + " ");
                Thread.sleep(500);
            }
            return false;
        }
    }

    void startEngins();

    void start();

}
