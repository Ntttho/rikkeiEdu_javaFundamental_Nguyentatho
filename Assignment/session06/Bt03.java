package assignment.session06;

public class Bt03 {
    public static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setPrice(double price) {
            if (price < 0) {
                System.out.println("gia ban khong duoc am");
                return;
            }
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
        }
        
    }
    public static void main(String[] args) {
        Product p = new Product(101, "Snack", 100000.00);
        p.setPrice(-10);
        System.out.println(p);
    }
}
