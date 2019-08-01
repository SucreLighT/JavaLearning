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
    泛型高级之通配符
    1.泛型通配符<?> 一般在声明变量类型时使用
     表示任意类型，如果没有明确，那么就是Object以及任意的Java类
    2. ? extends E  【E是父类，？子类】
	向下限定，该泛型可以存E及其子类
    3. ? super E  【？是父类，E子类】
	向上限定，该泛型可以存E及其父类
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
