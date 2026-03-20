package assignment.session15.btth;

public abstract class Person {
    static int idAuto = 1;
    private int id;
    private String fullName;
    private int age;
     
    public Person(String name, int age) {
        this.age = age;
        this.fullName = name;
        id = idAuto++;
    }

    abstract void showInfo();

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}