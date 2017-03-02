package edu.haim.java.Ducks.behaviours;

/**
 * Created by hackeru on 02/03/2017.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }

}
