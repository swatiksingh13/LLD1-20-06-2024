package in.scaler.lld1200624.lld1class12.streams;

import in.scaler.lld1200624.lld1class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
        public static void main(String[] args) {
           demoCreateStream();
            demoStream();
        }

        private static void demoCreateStream() {
            List<Integer> nums = Arrays.asList(2, 3, 1, 7, 6, 4, 5);
            // 1. using list
            Stream<Integer> stream1 = nums.stream();

            // 2. Directly create a stream
            Stream<Integer> stream2 = Stream.of(2, 3, 1, 7, 6, 4, 5);

            // 3. Stream - Builder design pattern
            Stream.Builder<Integer> streamBuilder = Stream.builder();
            streamBuilder.add(1);
            streamBuilder.add(2);
            streamBuilder.add(3);
            streamBuilder.add(4);
            streamBuilder.add(5);
            streamBuilder.build();
        }
        private static void demoStream() {
            //Odd numbers
            List<Integer> nums = Arrays.asList(2, 3, 1, 5, 4);
            List<Integer> oddNums = nums.stream().filter((x) -> x % 2 == 1).toList();
            System.out.println(oddNums); //[3, 1, 5]

            // Map students to marks
            List<Student> students = Arrays.asList(
                    new Student("Swati", 70, 2),
                    new Student("Aastha", 90, 1),
                    new Student("Singh", 50, 3)
            );
            System.out.println(students.stream().map((student) -> student.marks).toList()); //[70, 90, 50]

            // convert into upper case
            // :: method reference operator , scope of String class method called toUpperCase
            // map : function functional interface , hover on map and read by ctrl+touchpad
            List<String> students2 = Arrays.asList("Swati", "Aastha", "Lalita", "Avinash", "Shiv", "Ayush");
            System.out.println(students2.stream().map(String::toUpperCase).toList()); //SWATI, AASTHA, LALITA, AVINASH, SHIV, AYUSH]

            System.out.println(students2.stream().map((student) -> student.toUpperCase()).toList()); //SWATI, AASTHA, LALITA, AVINASH, SHIV, AYUSH]

            // FlatMao : flattening a LinkedList
            List<String> words2 = Arrays.asList("Hello", "World", "iPad", "MacBook Pro", "iPhone");
            List<List<String>> words2D = Arrays.asList(students2, words2);

            System.out.println(words2D);  //[[Swati, Aastha, Lalita, Avinash, Shiv, Ayush], [Hello, World, iPad, MacBook Pro, iPhone]]
            System.out.println(words2D.stream().flatMap(List::stream).map(String::toUpperCase).toList()); //[SWATI, AASTHA, LALITA, AVINASH, SHIV, AYUSH, HELLO, WORLD, IPAD, MACBOOK PRO, IPHONE]
        }
}