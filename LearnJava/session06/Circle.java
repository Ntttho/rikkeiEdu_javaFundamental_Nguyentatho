package LearnJava.session06;

public class Circle {
    private int radius;
    public double PI = 3.14;

    // constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "this radius id: "+this.radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(55);
        Circle circle2 = new Circle(7);
        circle1.setRadius(10);

        System.out.println(circle1);
        System.out.println(circle2);

    }

}
