package Lesson4;

import Lesson4.clothes.jackets.JacketAdidas;
import Lesson4.clothes.jackets.JacketVersace;
import Lesson4.clothes.pants.PantsNike;
import Lesson4.clothes.pants.PantsPuma;
import Lesson4.clothes.patternHuman.Human;
import Lesson4.clothes.shoes.ShoesNike;
import Lesson4.clothes.shoes.ShoesReebok;
import Lesson4.robots.hands.SamsungHand;
import Lesson4.robots.hands.SonyHand;
import Lesson4.robots.hands.ToshibaHand;
import Lesson4.robots.heads.SamsungHead;
import Lesson4.robots.heads.SonyHead;
import Lesson4.robots.heads.ToshibaHead;
import Lesson4.robots.legs.SamsungLeg;
import Lesson4.robots.legs.SonyLeg;
import Lesson4.robots.legs.ToshibaLeg;
import Lesson4.robots.patternRobot.Robot;
import Lesson4.space.cosmodrom.Cosmodrome;
import Lesson4.space.spaceships.Buran;
import Lesson4.space.spaceships.Challenger;
import Lesson4.space.spaceships.Shuttle;

public class Lesson4 {

    public static void main(String[] args) throws InterruptedException {

    }

    public static void humanClothes(){
        ShoesNike shoesNike = new ShoesNike();
        ShoesReebok shoesReebok = new ShoesReebok();
        JacketVersace jacketVersace = new JacketVersace();
        JacketAdidas jacketAdidas = new JacketAdidas();
        PantsPuma pantsPuma = new PantsPuma();
        PantsNike pantsNike = new PantsNike();
        Human ivgen = new Human("Ivgen",jacketAdidas,pantsNike,shoesReebok);
        Human alex = new Human("Alex",jacketVersace,pantsPuma,shoesNike);
        ivgen.getDressed();
        alex.undress();
    }

    public static void robot(){

        SonyHead sonyHead = new SonyHead(9470);
        SamsungHead samsungHead = new SamsungHead(8704);
        ToshibaHead toshibaHead = new ToshibaHead(7215);
        SonyHand sonyHand = new SonyHand(7650);
        SamsungHand samsungHand = new SamsungHand(6980);
        ToshibaHand toshibaHand = new ToshibaHand(5890);
        SonyLeg sonyLeg = new SonyLeg(5670);
        SamsungLeg samsungLeg = new SamsungLeg(5120);
        ToshibaLeg toshibaLeg = new ToshibaLeg(4567);

        Robot robot1 = new Robot(sonyHead,toshibaHand,samsungLeg);
        Robot robot2 = new Robot(samsungHead,samsungHand,sonyLeg);
        Robot robot3 = new Robot(toshibaHead,toshibaHand,samsungLeg);

        System.out.println("Робот номер 1 ");
        robot1.action();
        System.out.println("\nРобот номер 2 ");
        robot2.action();
        System.out.println("\nРобот номер 3 ");
        robot3.action();

        if(robot1.getRobotPrice()>robot2.getRobotPrice()&robot1.getRobotPrice()>robot3.getRobotPrice()){
            System.out.println("\nПервый робот самый дорогой");
        } else if(robot2.getRobotPrice()>robot1.getRobotPrice()&robot2.getRobotPrice()>robot3.getRobotPrice()){
            System.out.println("\nВторой робот самый дорогой");
        } else System.out.println("\nТретий робот самый дорогой");
    }

    public static void space() throws InterruptedException {

        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        Buran buran = new Buran();
        Challenger challenger = new Challenger();

        cosmodrome.launch(shuttle);
        cosmodrome.launch(buran);
        cosmodrome.launch(challenger);

    }
}


