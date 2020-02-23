package interfaces.pizzeria;

public class test {
    public static void main(String[] args) {
        GlutenFree glutenFree=new GlutenFree();
        Classico one = new Classico("parmezan","tomato");
        Havaii two = new Havaii("parmezan","tomato","pork");
        Veggie three = new Veggie("mozarella","tomato","gherkin","pickled pepper",glutenFree);
        /*W powyższym zapisie musimy najpierw utworzyć obiekt typu GlutenFree - ciasto, a następnie przekazać go do pizzy*/

        one.Pizzapreppare();
        two.Pizzapreppare();
        three.Pizzapreppare();

    }
}
