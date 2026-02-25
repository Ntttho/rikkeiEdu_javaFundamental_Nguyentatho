package assignment.session09;

public class Bt02 {
    public static class Animal {
    
        protected void sound(){
            System.out.println("Am thanh loai vat.....");
        }
    }

    public static class Dog extends Animal {
    
        @Override
        protected void sound() {
            System.out.println("go go go");
        }
    }

    public static class Cat extends Animal {
    
        @Override
        protected void sound() {
            System.out.println("Mew mew mew");
        }
    }

    public static void main(String[] args) {
        Animal D = new Dog();
        Animal C = new Cat();

        D.sound();
        C.sound();
    }
}
