package Lesson4.robots.patternRobot;

import Lesson4.robots.hands.IHand;
import Lesson4.robots.heads.IHead;
import Lesson4.robots.legs.ILeg;

public class Robot implements IRobot{

    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg){
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.moveHand();
        leg.step();
    }

    @Override
    public int getRobotPrice() {
        return head.getHeadPrice() + hand.getHandPrice() + leg.getLegPrice();
    }
}
