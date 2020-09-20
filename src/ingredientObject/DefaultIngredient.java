package ingredientObject;

import interfaces.Ingredient;
import tasteObject.Taste;

public abstract class DefaultIngredient implements Ingredient {
    private String name;
    private Taste taste;
    private int weight;

    public DefaultIngredient(String name, Taste taste, int weight) {
        this.name = name;
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Taste getTaste() {
        return taste;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
