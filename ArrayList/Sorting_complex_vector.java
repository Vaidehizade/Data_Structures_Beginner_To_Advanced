package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_complex_vector {

    static int calculateTotalMarks(List<Integer> marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public static void main(String[] args) {
        // Build list of students (name, marks)
        List<Student> studentMarks = new ArrayList<>();
        studentMarks.add(new Student("Rohan", Arrays.asList(10, 20, 11)));
        studentMarks.add(new Student("Prateek", Arrays.asList(10, 21, 3)));
        studentMarks.add(new Student("Vivek", Arrays.asList(4, 5, 6)));
        studentMarks.add(new Student("Rijul", Arrays.asList(10, 13, 20)));

        // Sort descending by total marks
        Collections.sort(studentMarks, Comparator.comparingInt(Student::getTotal).reversed());

        // Print results
        for (Student s : studentMarks) {
            System.out.println(s.name + " " + s.getTotal());
        }
    }

    // Simple Student record-like class
    static class Student {
        final String name;
        final List<Integer> marks;

        Student(String name, List<Integer> marks) {
            this.name = name;
            this.marks = marks;
        }

        int getTotal() {
            return calculateTotalMarks(marks);
        }
    }
}