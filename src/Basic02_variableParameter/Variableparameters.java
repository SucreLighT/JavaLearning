/**
 * @author sucre
 * @date 2019-08-02
 * @time 18:01
 * @description 可变参数
 */

/*
    在调用方法时，可以传入n个参数
    注意：如果方法有多个参数名，可变参数名必须要放在最后
 */
class Student{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}

public class Variableparameters {
    public static void main(String[] args) {
//        test1(1,2,3,4,5);
        test2(1,"hello",new Student("a",20));
    }

    public static void test2(Object ... objs){
        for (Object obj:objs
        ) {
            System.out.println(obj.getClass());
        }

    }

    public static void test1(int ...nums){
        for (int x:nums
        ) {
            System.out.println(x);
        }
    }
}
