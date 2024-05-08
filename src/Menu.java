import java.awt.*;
import java.util.*;

public class Menu {

    //Record for the menu to help with the hashmap
    public record MenuItem(int option, String description, Runnable action) {}

    //This hashmap is used to add menuItems to the recipe menu
    private final Map<Integer, MenuItem> menuItems = new HashMap<>();

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Please select an option:");
                menuItems.forEach((key, item) -> System.out.println("\t" + item.option() + ". " + item.description()));
                System.out.print("Enter Selection: ");

                int selection = Integer.parseInt(scanner.nextLine());
                MenuItem item = menuItems.get(selection);
                if (item != null) {
                    item.action().run();
                } else {
                    System.out.println("Invalid selection, please try again.");
                }
            }

    }

    public Menu(){
        menuItems.put(1, new MenuItem(1, "Start a new recipe", this::addRecipe));
        menuItems.put(2, new MenuItem(2, "Show a specific recipe", this::showRecipe));
        menuItems.put(3, new MenuItem(3, "Exit", this::exit));
    }

    //Placeholder function for Recipe Class
    private void addRecipe() {
        System.out.println("Placeholder");
    }

    private void showRecipe() {
        System.out.println("Placeholder");
    }

    private void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }


}
