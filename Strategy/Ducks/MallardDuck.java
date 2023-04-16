package Ducks;

import Behavior.FlyNoWay;
import Behavior.FlyWithWings;
import Behavior.Quack;
import Behavior.QuackNoWay;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }

    public void display() {
        System.out.println("Я настоящая утка!");
    }
}
