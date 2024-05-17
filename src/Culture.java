import java.util.List;

public class Culture {
    public String name;
    public String meal;
    public String culture;
    public List<String> ingredients;
    public String allergies;
    public Culture(String name) {
        this.name = "Omellete";
        this.meal = "Breakfast";
        this.culture = "American";
        this.ingredients = List.of("Eggs\", \"Onion\", \"Bacon");
        this.allergies = "Eggs";

    }

    public record Culturemeal(String name, int option, String Culture, String meal, List<String> ingredients,
                              String allergies) {


    }
    public  Culturemeal() {
        Culturemeal.put(1, new Culturemeal("Chicken Noodle", 1, "American", "Lunch/Dinner", List.of("Carrots", "Noodles", "Celery", "Chicken"), "none"));
        Culturemeal.put(2, new Culturemeal("Miso Soup", 2, "Japanese", "Breakfast", List.of("Tofu", "Onions", "Wakame"), "Tofu"));
        Culturemeal.put(3, new Culturemeal("Sushi Rolls", 3, "Japanese", "Lunch", List.of("Rice", "Seafood", "Wakame"), "Seafood"));
        Culturemeal.put(4, new Culturemeal("Omellete", 4, "American", "Breakfast", List.of("Rice", "Seafood", "Wakame"), "Eggs"));
        Culturemeal.put(5, new Culturemeal("Spagettii", 5, "Italian", "Dinner", List.of("Rice", "Seafood", "Wakame"), "None"));
    }
}
