package Java10_collectionDemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-05
 * @time 09:24
 * @description HashSet
 */

/*
   1.此类实现 Set 接口
   2.由哈希表（实际上是一个 HashMap 实例）支持。
   3.它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
   4.此类允许使用 null 元素。
 */

class Student1{
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student1(String name, int age) {
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
}

public class HashSetDemo {
    public static void main(String[] args) {
        fun1();
        fun2();

    }

    /*
        HashSet不存储相同元素的原理是调用hashCode与equals方法
        如果比较的hashcode的值是一样的话，会调用equals方法，equals方法返回true,就不存元素，返回false就存元素
        如果比较的hashcode的值不一样，就直接存元素

        因此 对于存储自定义对象，要保证元素的唯一性，需要在自定义对象中重写hashCode和equals方法,编译器可以自动生成
         */

    private static void fun2() {
        Set<Student1> set = new HashSet<Student1>();
        set.add(new Student1("张三",20));
        set.add(new Student1("张三",20));
        set.add(new Student1("李四",20));
        set.add(new Student1("李四",20));
        set.add(new Student1("李四",20));
        System.out.println(set);    //若没有重写hashCode和equals方法，会输出五个元素
    }


    /*
    Set遍历一、增强for循环
    Set遍历二、迭代器
 */
    private static void fun1() {
        Set<String> set = new HashSet<String>();

        set.add("b");
        set.add("c");
        set.add("a");
        set.add("c");
        set.add(null);

        for (String str:set
        ) {
            System.out.print(str+" ");
        }

        System.out.println("\n=============");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
