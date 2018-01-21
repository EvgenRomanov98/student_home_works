import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name, int age ) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
