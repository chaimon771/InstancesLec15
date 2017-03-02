package edu.haim.java.Ducks;

import edu.haim.java.Ducks.behaviours.FlyBehaviour;
import edu.haim.java.Ducks.behaviours.FlyWIthWings;
import edu.haim.java.Ducks.behaviours.Quack;
import edu.haim.java.Ducks.behaviours.QuackBehaviour;

/**
 * Created by hackeru on 02/03/2017.
 */
public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(){
        flyBehaviour = new FlyWIthWings();
        quackBehaviour = new Quack();
    }

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim(){
        System.out.println("Swim");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
    public abstract void display();


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
