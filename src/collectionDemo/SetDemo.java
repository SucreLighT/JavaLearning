package collectionDemo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-05
 * @time 09:27
 * @description Set
 */

/*
  Set:接口
  1.一个不包含重复元素的 collection。
  2.最多包含一个 null 元素
  3.一般使用它实现类:HashSet,LinkedHashSet,TreeSet
  4.Set集合存和取的顺序不一样,【每一次取的顺序都可能不一样】
 */

public class SetDemo {
    public static void main(String[] args) {
        Set <String> set = new HashSet<String>();

        set.add("b");
        set.add("c");
        set.add("a");
        set.add("c");
        set.add(null);
        System.out.println(set);

        System.out.println("=============");

        for (String str:set
             ) {
            System.out.print(str+" ");
        }
    }
}
