package Collections;

public class Student1 implements Comparable<Student1>{
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Student1(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student1 that) {
        // this method is for current object
        // we will define our sorting logic
         // sort basics onn age
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }

        return this.age - that.age;
    }


}
