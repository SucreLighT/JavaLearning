package jAVA10_collectionDemo;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sucre
 * @date 2019-07-29
 * @time 11:19
 * @description ArrayList实例
 */

/*
    去除ArrayList中重复元素
    思路:创建一个新集合，遍历旧的集合，把每一个元素添加到新的集合
    在添加到新的集合前，要判断这个元素是否在新的集合中已经存在(contains方法)
 */

public class Demo03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println("list:"+list);

        List newList = new ArrayList();

        for (int i=0; i<list.size(); i++){
            Object obj = list.get(i);
            String str = (String)obj;
            if(!newList.contains(str)){
                newList.add(str);
            }
        }

        System.out.println("newList:"+newList);
    }
}
