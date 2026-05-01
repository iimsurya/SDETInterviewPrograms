package learnCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

    String studentName;
    int age;

    Student(String studentName, int age) {
        this.studentName = studentName;
        this.age=age;
    }

    public String toString(){
        return studentName + "(" + age + ")";
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Surya",26));
        students.add(new Student("Arya",12));
        students.add(new Student("variya",34));
        students.add(new Student("Mariya",10));

        students.sort(Comparator.comparing(s -> s.age));
        System.out.println(students);
    }
}
