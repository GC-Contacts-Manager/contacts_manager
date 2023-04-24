import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddContact {

    private String name;
    private int phoneNumber;

    public AddContact(String name) {
    }

    public void AddContact(String name) {
        System.out.println("Enter new contact name: ");

        String directory = "contacts"; // goes back to the root of the project
        String filename = "contacts.txt"; // reason for strings is it's just easier to work with atm

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename); // atm, this file doesn't actually exist

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        List<String> contactsList = Arrays.asList("John Marston", "Arthur Morgan", "Dutch Van Der Linde");
        List<Integer> phoneNumberList = Arrays.asList(123456789, 2103314814, 2103260611);

        try {
            Files.write(dataFile, contactsList);
            List<String> newContactList = Arrays.asList(name);
            Files.write(
                    dataFile,
                    newContactList,
                    StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Contact added!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

        String directory = "contacts"; // goes back to the root of the project
        String filename = "contacts.txt"; // reason for strings is it's just easier to work with atm

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename); // atm, this file doesn't actually exist
        System.out.println(dataFile);

        // OG CONTACTS LIST
        List<String> contactsList = Arrays.asList("John Marston", "Arthur Morgan", "Dutch Van Der Linde");
        List<Integer> phoneNumberList = Arrays.asList(123456789, 2103314814, 2103260611);

        try {
            Files.write(dataFile, contactsList);
            List<String> newContactList = Arrays.asList("Sadie Adler");
            Files.write(
                    dataFile,
                    newContactList,
                    StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }

        // LIST OF CONTACTS
        try {
            List<String> contactListFromFile = Files.readAllLines(dataFile);
            System.out.println(contactListFromFile);
            for (int i = 1; i <= contactListFromFile.size(); i+= 1){ // if you want it numbered !
                System.out.println(i + ": " + contactListFromFile.get(i - 1) + " || Phone Number: "); // .get is getting value from a list (index)
            }
        } catch (IOException e){
            e.printStackTrace();
        }



    }



}
