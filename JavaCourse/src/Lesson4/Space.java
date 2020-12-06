package Lesson4;

import Lesson4.space.spaceships.Buran;
import Lesson4.space.spaceships.Challenger;
import Lesson4.space.cosmodrom.Cosmodrome;
import Lesson4.space.spaceships.Shuttle;

public class Space {

    public static void main(String[] args) throws InterruptedException {

        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        Buran buran = new Buran();
        Challenger challenger = new Challenger();

        cosmodrome.launch(shuttle);
        cosmodrome.launch(buran);
        cosmodrome.launch(challenger);
    }

}
