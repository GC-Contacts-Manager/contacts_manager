import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SearchContact {
    public void searchContacts(){
        String directory = "contacts";
        String filename = "contacts.txt";
        Path dataFile = Paths.get(directory, filename);
        Scanner scanner = new Scanner(System.in);

        ReadContacts readContacts = new ReadContacts();


        List<String> contactsList = readContacts.readContacts();
        String searchedContact = "";


        System.out.println("Input the contact you would like to find.");
        String contactInput = scanner.nextLine();

        if(contactsList.contains(contactInput)){
            searchedContact = contactInput;
        }

        System.out.println(searchedContact);
    }
}
