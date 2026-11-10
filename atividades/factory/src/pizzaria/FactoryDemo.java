package pizzaria;

public class FactoryDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();

        nyStore.orderPizza("cheese");
        nyStore.orderPizza("veggie");
        nyStore.orderPizza("clam");
        nyStore.orderPizza("pepperoni");
    }
}