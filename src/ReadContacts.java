import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadContacts {
    public String directory = "contacts";
    public String filename = "contacts.txt";

    Path dataDirectory = Paths.get(directory);
    public Path dataFile = Paths.get(directory, filename);
    public void readContacts() {
        List<String> contactListFromFile = null;
        try {
            contactListFromFile = Files.readAllLines(this.dataFile);
            for (int i = 0; i <= contactListFromFile.size(); i++) {
                System.out.println(contactListFromFile.get(i));
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println(contactListFromFile);
    }
}
