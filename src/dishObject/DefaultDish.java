package dishObject;

import interfaces.Dish;
import interfaces.Ingredient;

import java.util.ArrayList;

public class DefaultDish implements Dish {
    private String name;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public DefaultDish(String name) {
        this.name = name;
    }

    public DefaultDish(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Ingredient> ingredients() {
        return ingredients;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public void cook() {

    }
}
