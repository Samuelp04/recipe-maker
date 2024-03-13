import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Please select an option:
                \t1. Start recipe
                \t2. Show current recipe
                \t3. Exit
                Enter Selection: \s
                """);


        switch (Integer.parseInt(scan.nextLine())){
            case 1:
                startRecipe();
                break;
            case 2:
                getRecipes();
                break;
            case 3:
                System.out.println("Will exit the program");
                break;
        }

    }


    static void startRecipe(){
        System.out.println("Function will start the process of creating a recipe");

    }

    static void getRecipes(){

    }

    static void showRecipes(){
        System.out.println("Will show what recipes the user has made");
    }

    static void getCulture(){

    }

    static void getAllergies(){

    }

}