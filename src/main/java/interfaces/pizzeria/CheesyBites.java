package interfaces.pizzeria;

public class CheesyBites implements PizzaDough{

    @Override
    public void prepareDough() {
        System.out.println("Preparing the dough.... Cheessy");
    }
}
