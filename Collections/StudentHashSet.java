package Collections;
import java.util.HashSet;
import java.util.Set;
public class StudentHashSet{
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1, "Babbar");
        Student s2 = new Student(1, "Babbar");
        Student s3 = new Student(1, "Babbar");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);


    }
}

