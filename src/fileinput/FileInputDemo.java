package fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\katja\\Desktop\\sub-ordner\\dokumente\\lorem-ipsum.txt");
        //alle möglichen if Abfragen machen ist hier möglich

        try{
            int count =0;
            FileInputStream fis = new FileInputStream(file);
            int byteRead;
            while((byteRead = fis.read()) != -1){
                System.out.println(byteRead);
                count++;


            }
            System.out.println("So viele zeichen gibt es: " + count);

            //byteRead = fis.read(); // ein Zeichen einlesen

            char[] chars = Character.toChars(byteRead);
            System.out.println("chars[0] = " + chars[0]);

            fis.close();

        }
        catch(FileNotFoundException ex){
            ex.printStackTrace(); // hier kann man den Benutzer noch darauf hinweisen
        }
        catch(IOException ex){
            ex.printStackTrace(); // hier kann ich nicht viel machen; wenn es nicht funktioniert dann funktioniert es nicht
            // maximal kann hier weitergeschmissen werden
            // quick and dirty, indem man das gemeinsam reinhauen würde aber lieber nicht
        }
    }
}
