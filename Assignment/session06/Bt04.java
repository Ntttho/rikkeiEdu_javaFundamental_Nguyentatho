package assignment.session06;

public class Bt04 {
    public static class Employee {
        static int idI = 1;
        private int id;
        private String name;
        private double salary;
        
        public Employee() {
            this.id = idI++;
            this.name = "name";
            this.salary = 10000000;
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
            this.salary = 0;
        }

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setSalary(double salary) {
            if (salary < 0) {
                System.out.println("Du lieu khong hop le");
                return;
            }
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }

        
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Nguyen van A");
        Employee e3 = new Employee(102, "B", 1000000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
