package collectionDemo;

import java.util.*;

/**
 * @author sucre
 * @date 2019-08-12
 * @time 09:49
 * @description TreeMap
 */

/*
    TreeMap
    TreeMap会对键key进行排序
    TreeMap的key，如果是自定义对象话，这个对象要实现Comparable接口，
    或者说在new TreeMap的时候，传一个comparator参数
 */
public class TreeMapDemo {
    public static void main(String[] args) {
//        fun1();

        fun2();
    }

    private static void fun2() {
        Map<Stu1,String> map = new TreeMap<Stu1, String>(new Comparator<Stu1>() {
            @Override
            //按名字字母倒序排序且允许同名
            public int compare(Stu1 o1, Stu1 o2) {
                int num = o2.name.compareTo(o1.name);
                num = num==0 ? 1 : num;
                return num;
            }
        });
        map.put(new Stu1("zhangsan", 18), "湖北");
        map.put(new Stu1("lisi", 18), "湖南");
        map.put(new Stu1("wanger", 18), "广东");
        map.put(new Stu1("wanger", 18), "广西");//改写上一条记录的值为“广西”

        Set<Map.Entry<Stu1,String>> entries = map.entrySet();
        for(Map.Entry<Stu1, String> entry : entries) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }

    private static void fun1() {
        Map<Stu1,String> map = new TreeMap<Stu1, String>();
        map.put(new Stu1("zhangsan", 18), "湖北");
        map.put(new Stu1("lisi", 18), "湖南");
        map.put(new Stu1("wanger", 18), "广东");
        map.put(new Stu1("wanger", 18), "广西");//改写上一条记录的值为“广西”

        Set<Map.Entry<Stu1,String>> entries = map.entrySet();
        for(Map.Entry<Stu1, String> entry : entries) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}

class Stu1 implements Comparable<Stu1>{
    String name;
    int age;

    //按名字字母正序排序且允许同名
    @Override
    public int compareTo(Stu1 o) {
        int num = this.name.compareTo(o.name);
        num = num==0 ? 1 : num;
        return num;
    }

    @Override
    public String toString() {
        return "Stu1{" +
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

    public Stu1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
