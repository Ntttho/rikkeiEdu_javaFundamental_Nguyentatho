package assignment.session09;

public class Bt03 {
    public static class Employee {
        protected String name;
        protected double salary;
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {
        String department;
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        @Override
        public String toString() {
            return "Manager [name=" + name + ", salary=" + salary + ", department=" + department + "]";
        }
        
    }

    public static void main(String[] args) {
        Employee m = new Manager("his name", 1000000.50, "Education");
        System.out.println(m);
    }
}
