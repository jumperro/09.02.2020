package interfaces.pizzeria;

public class AllAmerican implements PizzaDough{

    @Override
    public void prepareDough() {
        System.out.println("Preparing the dough.... American");
    }
}
