package Java04_object;

public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("张三",20);
        Person person2 = new Person("李四",22);
        Person person3 = person1;
        System.out.println("p1:" + person1.hashCode());
        System.out.println("p2:" + person2.hashCode());

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person3));

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}