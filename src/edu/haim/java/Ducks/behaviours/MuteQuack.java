package edu.haim.java.Ducks.behaviours;

/**
 * Created by hackeru on 02/03/2017.
 */
public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Not Quacking");
    }
}
