package Collections;

import java.util.Objects;

public class Student {
    public int rollNo;
    public String name;
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    
    public String tostring(){
        return "Student {" +
                "RollNo = " + rollNo +
                ", name = " + name +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
