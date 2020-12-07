package Lesson4.clothes.patternHuman;

import Lesson4.clothes.jackets.IJacket;
import Lesson4.clothes.pants.IPants;
import Lesson4.clothes.shoes.IShoes;

public class Human implements IHumanLook {

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name,IJacket jacket,IPants pants,IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void getDressed() {
        System.out.println(name + ' ' + jacket.putOn() + ' ' + pants.putOn() + ' ' + shoes.putOn());
    }

    @Override
    public void undress() {
        System.out.println(name + ' ' + jacket.takeoff() + ' ' + pants.takeoff() + ' ' + shoes.takeoff());
    }
}
