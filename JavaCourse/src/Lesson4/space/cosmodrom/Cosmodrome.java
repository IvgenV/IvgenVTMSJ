package Lesson4.space.cosmodrom;

import Lesson4.space.spaceships.IStart;

public class Cosmodrome {

    public void launch(IStart iStart) throws InterruptedException {
        System.out.println("\nStart check:");
        if(iStart.systemCheck()){
            iStart.startEngins();
            iStart.start();
        }else{
            System.out.println("\nPrelaunch check failed».");
        }
    }
}
