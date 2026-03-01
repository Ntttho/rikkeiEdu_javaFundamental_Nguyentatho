package assignment.session10;

import assignment.session10.Interface.BonusCaculator;

public class Bt05 {
    
    abstract static class Employee {
        String name;
        double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        abstract double caculateSalary();
    }

    static class OfficeStaff extends Employee {
        public OfficeStaff(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double caculateSalary() {
            // TODO Auto-generated method stub
            return baseSalary;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "OfficeStaff [name: " + this.name + " salary: " + this.caculateSalary() + "]";
        }
    }

    static class Manager extends Employee implements BonusCaculator {
        public Manager(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double caculateSalary() {
            // TODO Auto-generated method stub
            return this.baseSalary + this.getBonus();
        }

        @Override
        public double getBonus() {
            // TODO Auto-generated method stub
            return 500000;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Manager [name: " + this.name + " salary: " + this.caculateSalary() + "]";
        }
    }

    public static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff("Nguyen", 3000000);
        System.out.println(officeStaff);

        Manager manager = new Manager("Ta tho", 5000000);
        System.out.println(manager);
    }
}
