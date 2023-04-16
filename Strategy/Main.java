import Behavior.FlyForRocket;
import Behavior.FlyNoWay;
import Behavior.Quack;
import Behavior.QuackNoWay;
import Ducks.Duck;
import Ducks.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyForRocket());
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
        duck.performFly();
        duck.setQuackBehavior(new QuackNoWay());
        duck.setFlyBehavior(new FlyNoWay());
    }
}
