package interfaces.pizzeria;

import java.util.LinkedList;
import java.util.List;

public class Havaii implements Pizza{
    String cheese = "cheddar";
    String sauce = "tomato sause";
    String ham = "pork ham";
    private PizzaDough dough;



    public Havaii(String cheese, String sauce, String ham) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.ham = ham;
    }

    public Havaii() {
    }

    public  List<String> HavaiiPizza(){
        java.util.List<java.lang.String> ingredients = new LinkedList<>();
        ingredients.add(cheese);
        ingredients.add(sauce);
        ingredients.add(ham);
        return ingredients;
    }

    @Override
    public void Pizzapreppare() {

        System.out.println("To prepare "+getClass()+" pizzza you'll need above ingredients: "+getIngredients());
    }
    @Override
    public List getIngredients() {
        return HavaiiPizza();
    }
}
