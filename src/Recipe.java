import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Recipe {
    //instance variables
    private String name;
    private String meal;
    private String culture;
    private List<String> ingredients;
    private String allergies;



    /**
     * This is my value contructor below, but right now
     * it doesn't have any parameters, because I'm not 100% sure how I want it
     * to behave, just yet, or if I want more than one value constructor, which is most likely.
     * public Recipe(String name, String meal, String culture, String Allergies) Maybe.
     */
    public Recipe(String name, String meal, String culture, List<String> ingredients, String allergies) {
        this.name = name;
        this.meal =meal;
        this.culture = culture;
        this.ingredients = ingredients;
        this.allergies = allergies;

    }


    /**
    We have getters and setters, because we might need some data changed by the
    user or maybe by us. Either way I have included setters in case we need them.
     */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getAllergies() {
        return allergies;
    }

    static List<Recipe> recipeList = Arrays.asList(
            new Recipe("Chicken Noodle", "Lunch/Dinner", "American", Arrays.asList("Carrots", "Noodles", "Celery", "Chicken"), "none"),
            new Recipe("Miso Soup", "lunch", "Japanese", Arrays.asList("Tofu", "Onions", "Wakame"), "Tofu" ),
            new Recipe("Sushi Rolls", "Lunch", "Japanese", Arrays.asList("Rice", "Seafood", "Wakame"), "Seafood"),
            new Recipe("Omellete", "Breakfast","American", Arrays.asList("Eggs", "Onion", "Bacon"), "Eggs"),
            new Recipe("Spagettii", "Dinner", "Italian", Arrays.asList("Noodles", "Hamburger", "Tomato Sauce"), "None")
    );

    /**
     * for the main class:
     * for the stuff below I used "mealType" to substitute looking for the meal,
     * and "cuisine" when looking for the type of culture, but so I wouldn't confuse them. these of course can be changed,
     * just my default placeholders.
     * it needs System.out.println("What meal..?"
     * String mealType = nextLine();
     * System.out.println("What culture..?"
     * String cuisine = nextLine();
     *adding that in main, should fix the redlines below.
     * call by recipe.filterRecipe
     */

        //Hopefully it takes the input and puts it into ArrayList based off their selection.
    static List<Recipe> filterRecipes(String mealType, String cuisine) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for(Recipe recipe : recipes) {
            if(recipes.mealType.equalsIgnorecase(mealType) && recipe.cuisine.equalsIgnoreCase(cuisine)){
                filteredRecipes.add(recipe);
            }

        }return filteredRecipes;
    }


   /* This is stray code. I debated creating a matching recipes based off the above filter recipe. Then didn't.
   Further down is from when I was trying to get it to read a text file. It could read all the text file, just not all of it.
   This can be deleted before upload.

    static List<Recipe> matchingRecipe = filterRecipes (mealType, cuisine);
        if(matchingRecipe.isEmpty()){

    }

    public static List<Recipe> getMatchingRecipe() {
        return matchingRecipe;
    }
List<Recipe> searchRecipes = new ArrayList<>();
       try {
           for(String line : Files.readAllLines(recPath))
       }

            }

        }catch (IOException ex) {
            System.out.println("Error!");
            ex.printStackTrace();
        }*/


    }