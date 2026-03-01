package assignment.session10;

public class Interface {
    public interface Shape {
        double caculatingArea();
        double caculatingPerimeter();
    }

    public interface Swimmable {
        void swim();
    }
    public interface Flyable {
        void fly();
    }
    public interface RemoteControl {
        void powerOn();
        default void checkBattery() {
            System.out.println("Pin on dinh");
        };
    }

    public interface BonusCaculator {
        double getBonus();
    }
}
