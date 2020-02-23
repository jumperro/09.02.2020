package interfaces.pizzeria;

public class GlutenFree implements PizzaDough{
    @Override
    public void prepareDough() {
System.out.println("Preparing the dough.... Glutenfree");
    }
}
