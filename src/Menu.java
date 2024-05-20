import java.awt.*;
import java.util.*;
import java.util.List;

public class Menu {

    //Record for the menu to help with the hashmap
    public record MenuOptions(int option, String description, Runnable action) {}

    private final List<Recipe> selectedRecipes = new ArrayList<>();


    //This hashmap is used to add menuItems to the recipe menu
    private final Map<Integer, MenuOptions> menuOptions = new HashMap<>();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Please select an option:");
                menuOptions.forEach((key, item) -> System.out.println("\t" + item.option() + ". " + item.description()));
                System.out.print("Enter Selection: ");

                int selection = Integer.parseInt(scanner.nextLine());
                MenuOptions item = menuOptions.get(selection);
                if (item != null) {
                    item.action().run();
                } else {
                    System.out.println("Invalid selection, please try again.");
                }
            }
    }

    public Menu(){
        menuOptions.put(1, new MenuOptions(1, "Show all Recipes", this::showAllRecipes));
        menuOptions.put(2, new MenuOptions(2, "Show Selected Recipes", this::showFilteredRecipes));
        menuOptions.put(3, new MenuOptions(3, "Select a Recipe", this::selectRecipe));
        menuOptions.put(4, new MenuOptions(4, "Exit", this::exit));
    }

    /*
    Each one of the functions are used for the display menu.
     */
    private void showAllRecipes() {
        System.out.println("All Available Recipes:");
        for (Recipe recipe : Recipe.recipeList) {
            System.out.println(recipe);
        }
    }

    private void showFilteredRecipes() {
        if (selectedRecipes.isEmpty()) {
            System.out.println("No recipes selected yet.");
        } else {
            System.out.println("Selected Recipes:");
            for (Recipe recipe : selectedRecipes) {
                System.out.println(recipe);
            }
        }
    }

    private void selectRecipe() {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<String> mealTypes = new HashSet<>();
            Set<String> cultures = new HashSet<>();
            List<Recipe> recipeList = Recipe.recipeList; // Assuming there's a method to get the list of recipes

            for (Recipe recipe : recipeList) {
                mealTypes.add(recipe.getMeal());
                cultures.add(recipe.getCulture());
            }

            System.out.println("Available Meal Types: " + mealTypes);
            System.out.print("Enter the meal type: ");
            String mealType = scanner.nextLine().trim();

            System.out.println("Available Cultures: " + cultures);
            System.out.print("Enter the culture: ");
            String culture = scanner.nextLine().trim();

            List<Recipe> filteredRecipes = Recipe.filterRecipes(mealType, culture);
            if (filteredRecipes.isEmpty()) {
                System.out.println("No recipes found for meal type: " + mealType + " and culture: " + culture);
            } else {
                System.out.println("Filtered Recipes:");
                for (int i = 0; i < filteredRecipes.size(); i++) {
                    System.out.println((i + 1) + ". " + filteredRecipes.get(i).getName());
                }

                System.out.print("Enter the number of the recipe you want to select: ");
                int recipeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                if (recipeIndex >= 0 && recipeIndex < filteredRecipes.size()) {
                    Recipe selectedRecipe = filteredRecipes.get(recipeIndex);
                    selectedRecipes.add(selectedRecipe);
                    System.out.println("Selected Recipe Details: " + selectedRecipe);
                } else {
                    System.out.println("Invalid selection, please try again.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter a valid number.");
        }
    }
    private void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

}

