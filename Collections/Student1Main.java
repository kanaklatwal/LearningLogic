package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
public class Student1Main {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(19, "Viviy", 68));
        students.add(new Student1(23, "Luv", 87));
        students.add(new Student1(9, "ankiy", 55));
        students.add(new Student1(29, "Billy", 30));

        System.out.println(students);

        Collections.sort(students);// not applicable
        System.out.println(students);

        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.weight - o2.weight;
            }
        });
    }
}
