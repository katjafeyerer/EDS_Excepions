import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\katja\\OneDrive\\Dokumente");
        FileInputStream fis = new FileInputStream(file);
        int byteRead;
        while ((byteRead = fis.read()) != -1){
        char[] c = Character.toChars(byteRead);
            System.out.println(c[0]);
        }
    }

}

