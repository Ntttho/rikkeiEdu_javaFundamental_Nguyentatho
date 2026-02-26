package assignment.session09;

import java.util.ArrayList;

public class Bt05 {
    public static abstract class Employee {
        String name;
        public Employee(String name) {
            this.name = name;
        }

        abstract double calculateSalary();
    }

    public static class OfficeEmployee extends Employee{
        double baseSalary;
        public OfficeEmployee(String name, double baseSalary) {
            super(name);
            this.baseSalary = baseSalary;
        }
        @Override
        double calculateSalary() {
            return this.baseSalary;
        }
        @Override
        public String toString() {
            return "OfficeEmployee [name=" + name + ", baseSalary=" + baseSalary + "] with salary = "+this.calculateSalary();
        }
    }
    public static class ProductionEmployee extends Employee {
        int numOfProducts;
        double price;
        public ProductionEmployee(String name, int numOfProducts, double price) {
            super(name);
            this.numOfProducts = numOfProducts;
            this.price = price;
        }
        @Override
        double calculateSalary() {
            return numOfProducts * price;
        }
        @Override
        public String toString() {
            return "ProductionEmployee [name=" + name + ", numOfProducts=" + numOfProducts + ", price=" + price + "] with salary = "+this.calculateSalary();
        }
        
    }

    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        Employee e1 = new OfficeEmployee("Duc", 5000000);
        Employee e2 = new OfficeEmployee("Huy", 4500000);
        Employee e3 = new ProductionEmployee("The ah", 300, 14000);

        listEmployee.add(e3);
        listEmployee.add(e2);
        listEmployee.add(e1);

        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }
}
