package assignment.session06;

public class Bt05 {
    public static class Book {
        static int idI = 1;

        private int id;
        private String name;
        private double price;
        
        public Book(int id, String name, double price) {
            this.id = idI++;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
        }

        public static void main(String[] args) {
            Book b1 = new Book(10, "Nha Gia Kim", 190000.000);
            Book b2 = new Book(10, "Nha Gia Kim", 190000.000);

            System.out.println(b1);
            System.out.println(b2);
        }
        
    }
}
