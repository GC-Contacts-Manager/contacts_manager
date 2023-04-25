import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    Scanner scanner = new Scanner(System.in);
    public void removeContact(){
        String directory = "contacts";
        String filename = "contacts.txt";
        Path dataFile = Paths.get(directory, filename);
        ReadContacts readContacts = new ReadContacts();


        List<String> contactsList = readContacts.readContacts();

        System.out.println("Input the contact you would like to delete.");
        String deleteContact = scanner.nextLine();

        if(contactsList.contains(deleteContact)) {
            contactsList.remove(deleteContact);
        }

        List<String> updatedList = contactsList;

        try {
            Files.write(dataFile, updatedList);
            Files.write(
                    dataFile,
                    contactsList,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
