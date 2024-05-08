import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Recipe {
    //instance variables
    private String name;
    private String meal;
    private String culture;
    private String ingredients;
    private String allergies;

    private Path recipePath = Path.get("JavaRecipes/recipetwo.txt");



    /**
     * This is my value contructor below, but right now
     * it doesn't have any parameters, because I'm not 100% sure how I want it
     * to behave, just yet, or if I want more than one value constructor, which is most likely.
     * public Recipe(String name, String meal, String culture, String Allergies) Maybe.
     */
   /* public Recipe() {
        this.name = name;
        this.meal =meal;
        this.culture = culture;
        this.ingredients = ingredients;
        this.allergies = allergies;

    }*/


    /*
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    //Meathod to search for recipes. Hopefully.
    //Testing it can find and print
    public void recipePath() {
        Path recPath = Paths.get("JavaRecipes/recipetwo.txt");
        try {
            System.out.println(Files.readAllLines(recPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public Recipe() {
        loadRecipe();

    }

    public void loadRecipe(String newFile){
        recipePath = Paths.get(newFile);}

    //going to try this.
    // Checking for tags, maybe.
    //We use String to Boolean, because we want to know if the word is there-- yes or no.

    private void loadRecipe() {
        try {
            Map<String, Boolean> flags = new HashMap<>();
            flags.put("Name", false);
            flags.put("Meal", false);
            flags.put("Ingredients", false);
            flags.put("Cooking Time", false);
            flags.put("Description", false);
            flags.put("Culture", false);
            flags.put("Allergies", false);

            //What is this? Before the repeating cycle,
            // we have to initialize it to zero or one.
            //After that, we have to increase the counter
            // variable in one within the respective cycle.

            short counter = 0;

            for(String line : Files.readAllLines(recipePath)){ //has squiggly red line because of try catch.
                if(flags.containsValue(true)) {
                    if(flags.get("Name")){ //if we have "Name" get it.
                        name = line;
                        flags.replace("Name", false); //this resets it? Pretty sure.

                    }else if(flags.containsValue(true)) {
                        if(flags.get("Meal")){
                            meal = line;
                            flags.replace("Meal", false);
                        }


                    } else if(flags.containsValue(true)) {
                        if(flags.get("Ingredients")){
                            ingredients = line;
                            flags.replace("Meal", false);

                        } else if(flags.containsValue(true)) {
                            if (flags.get("Ingredients")) {
                                ingredients = line;
                                flags.replace("Meal", false);

                            } else if (flags.containsValue(true)) {
                                if (flags.get("Ingredients")) {
                                    ingredients = line;
                                    flags.replace("Meal", false);    //I haven't finished all of them yet.
                                    // Remember "Cooking Time" will need Integer.parseInt(line)

                                }


                            }
                            counter++;
                            //tag? yes or no, set the flag.
                        }else{
                            if((flags.containsKey(line.substring(1, line.length()-1)))){
                                flags.replace(line.substring(1,line.length()-1), true;
                            }

                        }




                    }
                }





       /*List<Recipe> searchRecipes = new ArrayList<>();
       try {
           for(String line : Files.readAllLines(recPath))
       }*/

            }

        }