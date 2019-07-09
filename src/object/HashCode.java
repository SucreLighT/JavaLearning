package object;

/**
 * hashCode()方法根据对象的内部地址返回一个整数
 */

public class HashCode {
    public static void main(String[] args) {
       Student student1 = new Student();
       Student student2 = new Student();
       Student student3 = student1;

       System.out.println("student1:" + student1.hashCode());
       System.out.println("student2:" + student2.hashCode());
       System.out.println("student3:" + student3.hashCode());
    }
}

class Student{
    String name;
    int age;
}
