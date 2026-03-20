package assignment.session15;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("\n=========== Stack ===========");

        Stack<Integer> s = new Stack<>();

        // them moi phan tu vao cuoi hang doi
        s.push(1);
        s.push(4);
        s.push(2);
        s.push(6);

        // peak() - lay ra phan tu o cuoi khong xoa
        System.out.println("peek o cuoi: " + s.peek());

        // pop() - lay ra phan tu cuoi va xoa di 
        System.out.println("Pop phan tu: " + s.pop());

        System.out.println("Stack => " + s);

        // ================
        System.out.println("\n=========== Queue ===========");
        // queue
        // ================
        Queue<Integer> queue = new LinkedList<>();

        // add() them phan tu vao cuoi queue
        queue.add(1);
        queue.add(7);
        queue.add(5);
        queue.add(3);

        // peek() - xem phan tu dau queue
        System.out.println("peek() queue ra: " + queue.peek());

        // dequeue bang lenh poll()
        System.out.println("poll queue ra: " + queue.poll());
        System.out.println("Queue => " + queue);

        Queue<Student> queue2 = new PriorityQueue<>((s1, s2) -> Integer.compare(s2.age, s1.age));

        queue2.add(new Student("null", 19));
        queue2.add(new Student("null", 29));

        System.out.println(queue2);
        

    }

}


class Student{
    int age;
    String name;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format(">>Name: %s - age: %d<<", this.name, this.age);
    }
}