package Java10_collectionDemo;

import java.util.LinkedList;

/**
 * @author sucre
 * @date 2019-07-29
 * @time 11:27
 * @description LinkedList
 */

/*
    addFirst(E e) 把元素添加到第一个位置
    addLast(E e) 把元素添加到最后的位置
    getFirst() 获取第一个元素
    getLast() 获取第二个元素
    removeFirst() 删除第一个元素
    removeLast() 移除第一个元素
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");
        System.out.println("LinkedList:" + list);

    }
}
