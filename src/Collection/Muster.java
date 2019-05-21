package Collection;
import  java.util.*;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();    //Collection为接口。不能实例化，使用ArrayList实例化
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();  //迭代器
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
