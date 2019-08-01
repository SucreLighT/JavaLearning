package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sucre
 * @date 2019-08-01
 * @time 08:42
 * @description 使用迭代器遍历泛型
 */


public class Demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("def");

        //泛型迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
