package simulador;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Som de pato de borracha!");
    }
}