package pizzaria;

public class ClamPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();

        System.out.println("Massa: " + dough.getClass().getSimpleName());
        System.out.println("Molho: " + sauce.getClass().getSimpleName());
        System.out.println("Queijo: " + cheese.getClass().getSimpleName());
        System.out.println("Marisco: " + clam.getClass().getSimpleName());
    }
}