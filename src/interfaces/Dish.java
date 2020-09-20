package interfaces;

import java.util.ArrayList;

public interface Dish {
    String getName();
    ArrayList<Ingredient> ingredients();
    void addIngredient(Ingredient ingredient);
    void cook();
}
