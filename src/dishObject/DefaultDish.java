package dishObject;

import interfaces.Dish;
import interfaces.Ingredient;
import tasteObject.Taste;

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
        boolean sweet = false;
        boolean salt = false;

        for (Ingredient ingredient : ingredients) {
            if(ingredient.getTaste().equals(Taste.SALTY))
                salt = true;
        }

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getTaste().equals(Taste.SWEET)) {
                sweet = true;
            }
        }

        if(sweet && salt) {
            System.out.println("Нельзя смешивать сладкое с солёным");
            System.out.println(name);
            System.out.println("ingredients = " + ingredients);
            return;
        }

        if(ingredients.size() >= 4) {
            System.out.println("Нельзя добавить больше 4-х ингредиентов");
            System.out.println(name);
            System.out.println("ingredients = " + ingredients);
            return;
        }

        System.out.println(name);
        System.out.println("ingredients = " + ingredients);

    }
}
