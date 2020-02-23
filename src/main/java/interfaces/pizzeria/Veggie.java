package interfaces.pizzeria;

import java.util.LinkedList;
import java.util.List;

public class Veggie implements Pizza{
    String cheese = "cheddar";
    String sauce = "tomato sause";
    String cucumber = "cucmber slices";
    String pepper ="pepper slices";
    private PizzaDough dough;
/*

public List<String> ingrets;
    public Veggie() {
    }

    public Veggie(List<String> ingrets){
    this.ingrets;
 */







    public Veggie(String cheese, String sauce, String cucumber, String pepper, PizzaDough pizzaDough) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.cucumber = cucumber;
        this.pepper = pepper;
        this.dough=pizzaDough;
    }

    public Veggie() {
    }

    public List<String> VeggiePizza(){
        java.util.List<java.lang.String> ingredients = new LinkedList<>();
        ingredients.add(cheese);
        ingredients.add(sauce);
        ingredients.add(cucumber);
        ingredients.add(pepper);
        return ingredients;
    }

    @Override
    public void Pizzapreppare() {
this.dough.prepareDough();
        System.out.println("To prepare "+getClass()+" pizzza you'll need above ingredients: " +getIngredients());
    }

    @Override
    public List getIngredients() {
        return VeggiePizza();
    }
}
