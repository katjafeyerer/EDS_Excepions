package Stringoutputdemo;

import java.io.*;

public class StringOutputDemoApp {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\katja\\Desktop\\FH\\sub-ordner\\dokumente\\stringoutput.txt");


        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            String helloWorld = "Hello World!";

            oos.writeObject(helloWorld);
            oos.flush();
            }

         catch (FileNotFoundException e){
            e.printStackTrace();
                //throw new RuntimeException();

        } catch (IOException e) {
            e.printStackTrace();

           // throw new RuntimeException(e);
        }
    }
}
