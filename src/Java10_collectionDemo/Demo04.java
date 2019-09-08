package Java10_collectionDemo;

import java.util.LinkedList;

/**
 * @author sucre
 * @date 2019-07-30
 * @time 10:17
 * @description 用LinkedList模拟栈
 */

/*
    实际上LinkedList类中实现了队列、栈和双端队列的操作
 */

class Stack{

    LinkedList list = new LinkedList();
    // 进栈
    public void in(Object object){
        list.addFirst(object);
    }
    // 出栈
    public Object out(){
        list.removeFirst();
        return list.getFirst();
    }
}

public class Demo04 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.in("a");
        stack.in("b");
        stack.in("c");
        stack.in("d");
        stack.out();
        System.out.println("stack:"+stack.list);
    }
}
