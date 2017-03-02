package edu.haim.java.Ducks;

import edu.haim.java.Ducks.behaviours.FlyBehaviour;
import edu.haim.java.Ducks.behaviours.FlyWIthWings;
import edu.haim.java.Ducks.behaviours.Quack;
import edu.haim.java.Ducks.behaviours.QuackBehaviour;

/**
 * Created by hackeru on 02/03/2017.
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        super(new FlyWIthWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Look like a RedHead Duck");
    }

}
