package pizzaria;

public class FactoryDemo {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        chicagoStore.orderPizza("cheese");
        System.out.println();

        chicagoStore.orderPizza("clam");
    }
}