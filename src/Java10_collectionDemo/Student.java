package Java10_collectionDemo;

/**
 * @author sucre
 * @date 2019-07-27
 * @time 09:54
 * @description 用于ArrayListDemo
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return 1;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
