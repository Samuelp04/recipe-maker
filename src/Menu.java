import java.util.Scanner;

public class Menu {


    public void displayMenu(){
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
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }


}
