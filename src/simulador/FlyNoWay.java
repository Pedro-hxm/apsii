package simulador;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Nao consigo voar.");
    }
}