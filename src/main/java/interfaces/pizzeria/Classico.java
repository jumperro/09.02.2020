package interfaces.pizzeria;

import java.util.LinkedList;
import java.util.List;

public class Classico implements Pizza{
    String cheese;
    String sauce;
    private PizzaDough dough;






    public Classico(String cheese, String sauce) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.dough=dough;
    }


    public Classico() {
    }




    @Override
    public void Pizzapreppare() {
//  dough.prepareDough();
        System.out.println("To prepare Margherita pizzza you'll need above ingredients: "+getIngredients());
    }


    @Override
    public List getIngredients() {
        List<String> ingredients = new LinkedList<>();
        return ingredients;
    }




}
