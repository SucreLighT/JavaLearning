package Java10_collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-11
 * @time 15:13
 * @description HashMap例题
 */

/*
    案例 :HashMap集合键是Student,值是String
	键是学生对象,代表每一个学生
	值是字符串对象,代表学生归属地
 */

/*
    注意事项:
	1.打印的key是student的toString方法返回的字符串
    2.如果key相同，会把前面的值替换掉,但是必须是同一个对象
	3.HashMap是无序的
	4.new出来的都不是相同的key,因为地址不同。如果属性一样，想替换前面对应属性一样的valus时候，需要重写equals&hashcode方法
 */
public class Demo08 {
    public static void main(String[] args) {
        Map<Stu,String> map = new HashMap<Stu,String>();
        map.put(new Stu("小刘", 18), "湖北");
        map.put(new Stu("小胡", 18), "湖南");
        map.put(new Stu("小官", 18), "广东");
        map.put(new Stu("小官", 18), "广西");//改写上一条记录的值为“广西”

        Set<Map.Entry<Stu,String>> entries = map.entrySet();
        for(Map.Entry<Stu, String> entry : entries) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}

class Stu{
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu stu = (Stu) o;
        return age == stu.age &&
                Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Stu(String name, int age) {
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