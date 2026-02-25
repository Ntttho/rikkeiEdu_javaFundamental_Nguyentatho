package assignment.session09;

public class BT04 {
    public static class Animal {

        protected void sound() {
            System.out.println("Am thanh loai vat.....");
        }
    }

    public static class Dog extends Animal {

        protected void go(){
            System.out.println("go fast");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        // dog.go(); // gay loi vi kieu du lieu la animal khong co phuong thuc go
        if(dog instanceof Dog){
            ((Dog)dog).go();
        }
    }
}
