package edu.haim.java.Ducks;

import edu.haim.java.Ducks.behaviours.FlyBehaviour;
import edu.haim.java.Ducks.behaviours.FlyNoWay;
import edu.haim.java.Ducks.behaviours.QuackBehaviour;
import edu.haim.java.Ducks.behaviours.Squeak;

/**
 * Created by hackeru on 02/03/2017.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Look like a Rubber Duck");
    }


}
