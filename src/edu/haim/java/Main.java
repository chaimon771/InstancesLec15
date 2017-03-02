package edu.haim.java;

import edu.haim.java.Ducks.Duck;
import edu.haim.java.Ducks.MallardDuck;
import edu.haim.java.Ducks.RedHeadDuck;
import edu.haim.java.Ducks.behaviours.FlyNoWay;
import edu.haim.java.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*        Person p1 = new Person("Moe", "Cohen");
        Person p2 = new Person("Joe", "Cohen");
        Person p3 = new Person("Dave", "David");

        //polymorphysm of interface
        List<Person> people = new ArrayList<Person>();

        people.add(p1);
        people.add(p2);
        people.add(p3);

        Collections.sort(people);

        System.out.println(people);*/

/*
        Duck m1 = new MallardDuck();
        m1.display();

        Duck r1 = new RedHeadDuck();
        r1.quack();
        r1.display();
*/

        //Change behaviour example via Setter
        Duck d = new MallardDuck();
        d.setFlyBehaviour(new FlyNoWay());
        d.display();
        d.performFly();


    }

}
