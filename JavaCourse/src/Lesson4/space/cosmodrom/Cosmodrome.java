package Lesson4.space.cosmodrom;

import Lesson4.space.spaceships.IStart;

public class Cosmodrome {

    public void launch(IStart iStart) throws InterruptedException {
        System.out.println("\nСтарт проверки:");
        if(!iStart.systemCheck()){
            System.out.println("\nПредстартова проверка провалена».");
        }else{
            iStart.startEngins();
            iStart.start();
        }
    }
}
