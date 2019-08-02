package collectionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sucre
 * @date 2019-08-02
 * @time 18:10
 * @description 集合嵌套(挺重要)
 */

/*
    案例需求
1.一个班的n学生是一个集合
2.一个学校n班也是一个集合
3.如何将这些数据用一个集合来表示
 */

public class Demo05 {
    public static void main(String[] args) {
        List<Student> java1 = new ArrayList<Student>();
        java1.add(new Student("A",20));
        java1.add(new Student("B",21));
        java1.add(new Student("C",22));

        List<Student> java2 = new ArrayList<Student>();
        java2.add(new Student("D",23));
        java2.add(new Student("E",24));
        java2.add(new Student("F",25));

        List<List<Student>> school = new ArrayList<List<Student>>();//集合的嵌套
        school.add(java1);
        school.add(java2);

        for (List<Student> stus:school
             ) {
            System.out.println("班级...");
            for (Student stu:stus
                 ) {
                System.out.println(stu);

            }

        }
    }
}
