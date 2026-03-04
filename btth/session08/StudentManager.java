package btth.session08;

public class StudentManager {
    final int MAX = 100;
    Student[] students;
    int count = 0;
    public StudentManager() {
        this.students = new Student[MAX];
    }

    void addStudent(Student student){
        if(count < MAX){
            this.students[count++] = student;
            System.out.println("Them moi sinh vien thu: " + count);
        }
    }

    void showStudent(){
        for(int i = 0; i < this.count;i++){
            System.out.println(students[i]);
        }
    }

}
