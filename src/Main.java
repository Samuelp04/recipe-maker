import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.displayMenu();


        Recipe recipe = new Recipe("Miso", "Lunch", "Japanese",
                Collections.singletonList((("Tofu, egg, broth"))), "tofu");
        Culture culture = new Culture("American");
       /* recipe.printCulture();
        recipe.printMeal();*/

    }



}