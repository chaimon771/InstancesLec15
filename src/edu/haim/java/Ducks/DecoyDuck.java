package edu.haim.java.Ducks;

import edu.haim.java.Ducks.behaviours.FlyBehaviour;
import edu.haim.java.Ducks.behaviours.FlyNoWay;
import edu.haim.java.Ducks.behaviours.MuteQuack;
import edu.haim.java.Ducks.behaviours.QuackBehaviour;

/**
 * Created by hackeru on 02/03/2017.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Look like a Decoy Duck");
    }
}
