package Lesson4;

import Lesson4.сlothes.jackets.JacketAdidas;
import Lesson4.сlothes.jackets.JacketVersace;
import Lesson4.сlothes.pants.PantsNike;
import Lesson4.сlothes.pants.PantsPuma;
import Lesson4.сlothes.patternHuman.Human;
import Lesson4.сlothes.shoes.ShoesNike;
import Lesson4.сlothes.shoes.ShoesReebok;

public class HumanTask {

    public static void main(String[] args){

        ShoesNike shoesNike = new ShoesNike();
        ShoesReebok shoesReebok = new ShoesReebok();
        JacketVersace jacketVersace = new JacketVersace();
        JacketAdidas jacketAdidas = new JacketAdidas();
        PantsPuma pantsPuma = new PantsPuma();
        PantsNike pantsNike = new PantsNike();
        Human ivgen = new Human("Ivgen",jacketAdidas,pantsNike,shoesReebok);
        Human alex = new Human("Alex",jacketVersace,pantsPuma,shoesNike);
        ivgen.getdressed();
        alex.undress();

    }

}
