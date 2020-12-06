package Lesson4.space.spaceships;


public class Shuttle implements IStart {

    @Override
    public boolean systemCheck() throws InterruptedException {
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

    @Override
    public void startEngins() {
        System.out.println("\nДвигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
