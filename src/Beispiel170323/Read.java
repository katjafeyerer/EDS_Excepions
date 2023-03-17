package Beispiel170323;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\katja\\Desktop\\FH\\sub-ordner\\dokumente\\from_console.txt");

        int byteRead;
        try (FileOutputStream fos = new FileOutputStream(f)) {
            while ((byteRead = System.in.read()) != 'x') {
                fos.write(byteRead);
            }
            fos.flush();
        }
        catch(IOException e){
                throw new RuntimeException(e);
            }


    }
}
