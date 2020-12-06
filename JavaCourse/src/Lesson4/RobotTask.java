package Lesson4;

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

public class RobotTask {

    public static void main(String[] args){

        int robotprice1;
        int robotprice2;
        int robotprice3;

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

        robotprice1 = robot1.getRobotPrice();
        robotprice2 = robot2.getRobotPrice();
        robotprice3 = robot3.getRobotPrice();

        System.out.println("Робот номер 1 ");
        robot1.action();
        System.out.println("\nРобот номер 2 ");
        robot2.action();
        System.out.println("\nРобот номер 3 ");
        robot3.action();

        if(robotprice1>robotprice2&robotprice1>robotprice3){
            System.out.println("\nПервый робот самый дорогой");
        } else if(robotprice2>robotprice1&robotprice2>robotprice3){
            System.out.println("\nВторой робот самый дорогой");
        } else System.out.println("\nТретий робот самый дорогой");
    }

}
