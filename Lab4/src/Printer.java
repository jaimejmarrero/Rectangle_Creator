import java.util.Scanner;

public class Printer {

    public static void main(String[] args){

        String command = "";
        Scanner scannerIn = new Scanner(System.in);
        Rectangle rect = null;

        while(!command.equals("exit")) {
            // When the main method starts, the program will print a list of the available commands.
            System.out.println("Commands available: ");
            System.out.println("\t'create' - replace the stored rectangle");
            System.out.println("\t'display' - show information about the stored rectangle");
            System.out.println("\t'render' - render the stored rectangle");
            System.out.println("\t'exit' - leave the program");

            System.out.print("Enter a command: ");
            command = scannerIn.nextLine().toLowerCase();

            // If the user enters "create"
            if(command.equals("create")) {
                // Prompt the user to enter a width, then a height, and then a symbol
                System.out.print("Enter the rectangle's width: ");
                int width = Integer.parseInt(scannerIn.nextLine());

                System.out.print("Enter the rectangle's height: ");
                int height = Integer.parseInt(scannerIn.nextLine());

                System.out.print("Enter the rectangle's symbol: ");
                String symbol = scannerIn.nextLine();

                rect = new Rectangle(height, width, symbol);
            }
            if(command.equals("display")) {
                // Otherwise, display a helpful warning message that no Rectangle has been created yet.
                if(rect == null) {
                    System.out.println("You need to create a rectangle first!");
                    continue;
                }

                // If the rectangle is already saved, call get_details_text and display the returned String.
                String details = rect.get_details_text();
                System.out.println(details);
            }
            if(command.equals("render")) {
                if(rect == null) {
                    System.out.println("You need to create a rectangle first!");
                    continue;
                }

                // Print your Rectangle object using its toString method.
                System.out.println(rect.toString());

                System.out.println("There are " + rect.calculate_area() + " symbols displayed.");
                System.out.println("The perimeter is " + rect.calculate_perimeter() + ". (Count corners twice!)");
            }
        }

        // Print a goodbye message and stop asking for additional commands (ending the program).
        System.out.println("Goodbye!");
    }

}
