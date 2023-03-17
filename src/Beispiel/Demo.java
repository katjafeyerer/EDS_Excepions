package Beispiel;

public class Demo {
    public static void main(String[] args) {
        Product p = new Product("Hallo", 15, "123");
        Product p2 = new Product("Hi", 20, "124");

        ProductManager productManager = new ProductManager();

        productManager.add(p);
        productManager.add((p2));

        System.out.println(productManager.toString());

        productManager.save("C:\\Users\\katja\\Desktop\\FH\\sub-ordner\\dokumente\\products.dat");

        productManager.load("C:\\Users\\katja\\Desktop\\FH\\sub-ordner\\dokumente\\products.dat");

        productManager.print();
    }
}
