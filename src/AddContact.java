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
    private String phoneNumber;

    public AddContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void AddNewContact(String name) {
        String directory = "contacts"; // goes back to the root of the project
        String filename = "contacts.txt"; // reason for strings is it's just easier to work with atm

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename); // atm, this file doesn't actually exist

        List<String> contactsList = Arrays.asList("John Marston || 123456789", "Arthur Morgan || 2103314814", "Dutch Van Der Linde || 2103260611");

        Scanner input = new Scanner(System.in);
        // String contactName = input.getString("Enter the contacts name and number: ");
        String addedContact = input.nextLine();
        boolean isAdded = false;

//        try {
//            List<String> lines = Files.readAllLines(dataFile);
//
//            for (String line : lines) {
//                if (line.equals(addedContact)) {
//                    isAdded = true;
//                }
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }



        try {
            Files.write(dataFile, contactsList);
            List<String> newContactList = Arrays.asList(name);
            Files.write(
                    dataFile,
                    newContactList,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<String> contactListFromFile = Files.readAllLines(dataFile);
            for (int i = 1; i <= contactListFromFile.size(); i += 1) { // if you want it numbered !
                System.out.println(i + ": " + contactListFromFile.get(i - 1)); // .get is getting value from a list (index)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}