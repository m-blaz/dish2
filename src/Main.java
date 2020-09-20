import dishObject.DefaultDish;
import ingredientObject.*;
import tasteObject.Taste;

public class Main {
    public static void main(String[] args) {
        Sugar sugar = new Sugar("Сахар", Taste.SWEET, 2);
        Honey honey = new Honey("Мёд", Taste.SWEET, 5);
        Pepper pepper = new Pepper("Перец", Taste.BITTER, 1);
        Salt salt = new Salt("Соль", Taste.SALTY, 3);
        Vinegar vinegar = new Vinegar("Уксус", Taste.SOUR, 4);
        Cucumber cucumber = new Cucumber("Огурец", Taste.SOUR, 15);

        DefaultDish dish = new DefaultDish("Первое блюдо");

        dish.addIngredient(salt);
        dish.addIngredient(honey);
        dish.cook();

        DefaultDish dish2 = new DefaultDish("Второе блюдо");
        dish2.addIngredient(honey);
        dish2.addIngredient(pepper);
        dish2.addIngredient(vinegar);
        dish2.addIngredient(cucumber);
        dish2.cook();
    }
}
