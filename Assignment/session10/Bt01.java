package assignment.session10;

import assignment.session10.Interface.Shape;

public class Bt01 {
    public static class Circle implements Shape {
        double radius;
        static double PI = 3.14;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double caculatingArea() {
            // TODO Auto-generated method stub
            return this.radius * this.radius * PI;
        }
        @Override
        public double caculatingPerimeter() {
            // TODO Auto-generated method stub
            return 2 * this.radius * PI;
        }
    }

    public static class Rectangle implements Shape {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double caculatingArea() {
            // TODO Auto-generated method stub
            return this.height * this.width;
        }

        @Override
        public double caculatingPerimeter() {
            // TODO Auto-generated method stub
            return this.height * 2 + this.width * 2;
        }
        
    }
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.printf("Circle S-P : %.2f - %.2f\n",circle.caculatingArea(), circle.caculatingPerimeter());
        System.out.printf("Rectangle S-P : %.2f - %.2f\n",rectangle.caculatingArea(), rectangle.caculatingPerimeter());
    }
}
