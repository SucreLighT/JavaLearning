package Java10_collectionDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-12
 * @time 10:19
 * @description 集合的嵌套,Map嵌套Set
 */

/*
    一个学校两个班级 一个班级若干学生
 */

public class Demo10 {
    public static void main(String[] args) {
        Set<stu> class1 = new HashSet<stu>();
        class1.add(new stu("a",20));
        class1.add(new stu("b",21));
        class1.add(new stu("c",22));

        Set<stu> class2 = new HashSet<stu>();
        class2.add(new stu("d",20));
        class2.add(new stu("e",21));
        class2.add(new stu("f",22));

        Map<String,Set<stu>> school = new HashMap<String, Set<stu>>();
        school.put("1班",class1);
        school.put("2班",class2);

        for (Map.Entry<String,Set<stu>> entry:school.entrySet()
             ) {
            System.out.println("班级名："+ entry.getKey());

            for (stu s:entry.getValue()
                 ) {
                System.out.println(s);
            }
        }
    }
}

class stu{
    String name;
    int age;

    @Override
    public String toString() {
        return "stu{" +
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

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}