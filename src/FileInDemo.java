import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInDemo {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\katja\\Desktop\\sub-ordner\\dokumente\\lorem-ipsum.txt");
        if(!f.exists()){
            System.out.println("Datei existiert nicht...");
        }
        long countCharacters = 0;
        try {
            FileInputStream fis = new FileInputStream(f);
            int byteRead;
            while((byteRead = fis.read()) != -1){
               // char[] c = Character.toChars(byteRead);
               // System.out.print(c[0]);

                System.out.println((char) byteRead);
                countCharacters++;

            }
            fis.close();
            System.out.println();
            System.out.println("Anzahl der Zeichen " + countCharacters);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
