import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SearchContact {
    public static void searchContacts(){
        String directory = "contacts";
        String filename = "contacts.txt";
        Path dataFile = Paths.get(directory, filename);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the contact you would like to find.");
        String contactInput = scanner.nextLine();
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for(String line : lines){
                if(line.equalsIgnoreCase(contactInput)){
                    System.out.println(contactInput);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
