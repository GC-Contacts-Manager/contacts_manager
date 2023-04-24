import java.util.Scanner;

public class Initialization {
    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option.");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):\n");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        if (userChoice == 1){
            new ReadContacts();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if(continueProgram.equalsIgnoreCase("y")){
                startProgram();
            }
        } else if(userChoice == 2) {
            System.out.println("You selected 2");
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if(continueProgram.equalsIgnoreCase("y")){
                startProgram();
            }
        } else if(userChoice == 3) {
            new SearchContact();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("y")) {
                startProgram();
            }
        } else if(userChoice == 4) {
            System.out.println("You selected 2");
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("y")) {
                startProgram();
            }
        } else if(userChoice == 5) {
            System.out.println("You selected 2");
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("y")) {
                startProgram();
            }
        }
    }
}
