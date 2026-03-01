package assignment.session10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bt06 {
    static class Product {
        String name;
        double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return String.format("%s |Price: %.2f|",this.name, this.price);
        }
    }
    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("Product 1", 490000));
        listProduct.add(new Product("Snack 1", 17000));
        listProduct.add(new Product("OMOmatic 1", 6000));
        listProduct.add(new Product("Ellclascical", 4000));
        listProduct.add(new Product("Dai thanh", 100000));

        // dung anonymous class cua comparator de tao nen mot class sap xep p theo price
        // Collections.sort(listProduct, new Comparator<Product>() {

        //     // couter dai dien cho index
        //     private int couter = 0;
        //     @Override
        //     public int compare(Product p1, Product p2) {
        //         // TODO Auto-generated method stub
        //         couter++;
        //         return Double.compare(p1.price, p2.price);
        //     }
        // });

        
        // dung lambda expression
        Collections.sort(listProduct, (p1, p2) -> {return Double.compare(p1.price, p2.price);});
        
        System.out.println("=========");
        listProduct.forEach(System.out::println);
    }
}
