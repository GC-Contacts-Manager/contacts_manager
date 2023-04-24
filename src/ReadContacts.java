import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadContacts {
    String directory = "contacts";
    String filename = "contacts.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);
    public List<String> readContacts(List<String>contactList){
        try {
            contactList = Files.readAllLines(dataFile);
            for (int i = 0; i <= contactList.size(); i++) {
                System.out.println(contactList.get(i));
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return contactList;
    }
}
