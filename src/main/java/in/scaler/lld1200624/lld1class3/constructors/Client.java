package in.scaler.lld1200624.lld1class3.constructors;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //demoConstructor();
        demoPassByValue();
    }

    private static void demoPassByValue() {
        // Pass By Value
        int x=10;
        fun1(x);
        System.out.println(x);
        System.out.println("Debug 1");

        List<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(98);
        Student newStudent = new Student("Aastha",24,100,marks);
        fun2(newStudent);
        System.out.println(newStudent.getName());
        System.out.println("Debug 2");
    }

    private static void fun1(int x) {
         x = x + 70;
    }

    private static void fun2(Student s) {
        System.out.println("fun2");
        s.setName("Swati");
    }

    public static void demoConstructor() {

        List<Integer> marks= new ArrayList<>();
        marks.add(96);
        marks.add(94);
        marks.add(92);

        Student student1 = new Student("Aastha",24,100,marks);
        //Student student2 = new Student();

        //create a copy of  student1

        Student student3 = new Student(student1);
        //create a copy of  student2
        //Student student4 = new Student(student2);

        marks.add(89);  //shallow copy
        student3.setName("Swati");  //deep copy // student 1 name is aastha
        System.out.println("Debug");
    }
}
