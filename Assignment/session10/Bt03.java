package assignment.session10;

import assignment.session10.Interface.Flyable;
import assignment.session10.Interface.Swimmable;

public class Bt03 {
    public static class Duck extends Animal implements Swimmable, Flyable{
        public Duck(String name) {
            super(name);
        }

        @Override
        public void swim() {
            // TODO Auto-generated method stub
            System.out.println("Boi tren mat nuoc va lan xuong nuoc");
        }

        @Override
        public void fly() {
            // TODO Auto-generated method stub
            System.out.println("Bay duoc mot doan ngan thoi");
        }
    }

    public static class Fish extends Animal implements Swimmable{
        public Fish(String name) {
            super(name);
        }
        @Override
        public void swim() {
            // TODO Auto-generated method stub
            System.out.println("Boi duoi nuoc thinh thoang thi nhay len");
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck("Duck duck");
        Fish fish = new Fish("Fish fish");

        duck.swim();
        duck.fly();

        fish.swim();
    }
}
