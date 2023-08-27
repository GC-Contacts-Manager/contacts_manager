import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class AddContact {

    public void AddNewContact() {
        String directory = "contacts"; // goes back to the root of the project
        String filename = "contacts.txt"; // reason for strings is it's just easier to work with atm
        Scanner input = new Scanner(System.in);
        Path dataFile = Paths.get(directory, filename); // atm, this file doesn't actually exist
        ReadContacts readContacts = new ReadContacts();

        List<String> contactsList = readContacts.readContacts();
        System.out.println("Enter a name.");
        String addedContact = input.nextLine();
        System.out.println("Now enter the number.");
        String addedNumber = input.nextLine();
        String contact = (addedContact + " | " + addedNumber);
        contactsList.add(contact);

        try {
            Files.write(dataFile, contactsList);
            Files.write(
                    dataFile,
                    contactsList,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}