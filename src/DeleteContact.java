import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    Scanner scanner = new Scanner(System.in);
    public void removeContact(){
        String directory = "contacts";
        String filename = "contacts.txt";
        Path dataFile = Paths.get(directory, filename);
        System.out.println("Input the contact you would like to delete.");
        String deleteContact = scanner.nextLine();
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for(String line : lines){
                if(line.equalsIgnoreCase(deleteContact)){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
