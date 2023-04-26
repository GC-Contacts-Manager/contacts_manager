import java.util.Scanner;

public class Initialization {
    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        ReadContacts contacts = new ReadContacts();
        SearchContact contactSearch = new SearchContact();
        AddContact addContact = new AddContact();
        DeleteContact deleteContact = new DeleteContact();
        End killIt = new End();

        System.out.println("Select an option.");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):\n");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        // USER INPUTS AND METHOD CALLS

        if (userChoice == 1){
            contacts.readContacts();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if(continueProgram.equalsIgnoreCase("y")){
                startProgram();
            }
        } else if(userChoice == 2) {
            addContact.AddNewContact();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if(continueProgram.equalsIgnoreCase("y")){
                startProgram();
            }
        } else if(userChoice == 3) {
            contactSearch.searchContacts();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("y")) {
                startProgram();
            }
        } else if(userChoice == 4) {
            deleteContact.removeContact();
            System.out.println("Would you like to select another option? [Y/N]");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("y")) {
                startProgram();
            }
        } else if(userChoice == 5) {
            killIt.killSwitch();
        }
    }
}
