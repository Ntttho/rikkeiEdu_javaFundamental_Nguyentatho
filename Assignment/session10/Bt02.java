package assignment.session10;

public class Bt02 {
    public static class Car extends Vehicle {
        public Car(String brand) {
            super(brand);
        }
        @Override
        void move() {
            // TODO Auto-generated method stub
            System.out.println("Hang xe: " + this.brand + " - Xe chay bang dong co");
        }
    }

    public static class Bicycle extends Vehicle {
        public Bicycle(String brand) {
            super(brand);
        }
        @Override
        void move() {
            // TODO Auto-generated method stub
            System.out.println("Hang xe: " + this.brand + " - Xe chay bang suc nguoi");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Bicycle bicycle = new Bicycle("Fixgear");
        car.move();
        bicycle.move();
    }
}
