package edu.haim.java;

/**
 * Created by hackeru on 02/03/2017.
 */
public class Cat extends Animal implements IsWarmBlooded{

    @Override
    public void makeSound() {
        System.out.println("Miaaooo");
    }

    @Override
    public double getBodyTemperature() {
        return 39.0;
    }
}
