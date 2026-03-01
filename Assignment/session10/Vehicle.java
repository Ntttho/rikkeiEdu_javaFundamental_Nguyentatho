package assignment.session10;
public abstract class Vehicle {
    protected String brand;
    public Vehicle(String branh) {
        this.brand = branh;
    }

    abstract void move();
}
