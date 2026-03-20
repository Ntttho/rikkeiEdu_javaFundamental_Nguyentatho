package btth.session08;

public class StudentManager {
    final int MAX = 10;
    Student[] students;
    int count = 0;
    public StudentManager() {
        this.students = new Student[MAX];
    }

    void addStudent(Student student){
        if(count < MAX){
            this.students[count++] = student;
            System.out.println("Them moi sinh vien thu: " + count);
        }else{
            System.err.println("Danh sach lop da day");
        }
    }

    void showStudent(){
        for(int i = 0; i < this.count;i++){
            System.out.println(students[i]);
        }
    }

}
