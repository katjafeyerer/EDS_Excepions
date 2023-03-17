package Beispiel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> productManager = new ArrayList<>();
    public void add(Product p){
        productManager.add(p);
    }
    public void save(String path){
        try(ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(path))){

            for (Product p: productManager) {
                oos.writeObject(p);
            }
            oos.writeObject(null);
            oos.flush();

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productManager=" + productManager +
                '}';
    }
    public void print(){
        System.out.println("productManager = " + productManager);
    }
    public void load(String path){
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path))){
            Object readObject;
            while((readObject = ois.readObject()) !=null){
                Product p = (Product) readObject;
                add(p);
            }
        }catch(EOFException eof){
            System.out.println("Ende erreicht - juhu! alles gelesen"); //silent catch (exception ohne reaktion
            // sollte man nicht machen eigentlich
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
