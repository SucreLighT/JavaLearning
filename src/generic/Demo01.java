package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sucre
 * @date 2019-07-31
 * @time 10:50
 * @description 泛型
 */

/*
 * 1.如果集合添加基本数据类型，内部会提升为包装类型
 *   int -> Integer
 *   double -> Double
 *
 * 2.List list = new ArrayList(); 这样声明一个集合对象，默认是可以添加任何类型的元素
 *
 * 3.如果在声明集合时，不添加泛型，就会有安全隐患(类型转换异常)
 *
 * 4.声明一个泛型集合：List<String> list = new ArrayList<String>();
 *   代表list只能存字符串元素
 */
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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



public class Demo01 {
    public static void main(String[] args) {
//        test1();
        // 只能存字符串的list
        List <String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(12); 无法添加int类型
    }

    private static void test1() {
        List list = new ArrayList();

        //可以添加不同类型的元素到集合中
        list.add("hello");
        list.add(new Student("tony",12));
        list.add(12);
        System.out.println(list);

        for (int i=0; i<list.size();i++){
            Object obj = list.get(i);
            System.out.println(obj.getClass());
        }
    }
}
