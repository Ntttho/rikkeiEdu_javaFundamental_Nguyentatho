package assignment.session01;

public class Gioi01 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println(book1);
        System.out.println(book2);
        // book1 địa chỉ 1 trỏ vào ô nhớ heap với giá trị 'Java Basic'
        // book2 địa chỉ 2 trỏ vào ô nhớ heap với giá trị 'Python Intro'
        // temp = book1 có nghĩa temp cũng trỏ vào địa chỉ ô nhớ 1 trong heap nhưng lại lưu ở ô nhớ khác book1 book2 trong stack
        // thì swap
        // gán lại địa chỉ ô nhớ 1 cho book2
        // gán lại địa chỉ ô nhớ 2 cho book1
        // và sau đó in ra 2 book lúc này book1 lưu địa chỉ ô 1 và chứ giá trị "Java basic" và ô nhớ 2 với giá trị "Python Intro"
    }
}
