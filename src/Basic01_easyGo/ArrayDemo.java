package Basic01_easyGo;

public class ArrayDemo {
    public static void main(String[] args){
        double[] mylist = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for(double element: mylist)
        {
            System.out.println(element);
        }

        double total = 0;
        for(int i = 0; i < mylist.length; i++)
        {
            total += mylist[i];
        }
        System.out.println("Total:" + total);

        double max = mylist[0];
        for(int i = 1; i < mylist.length; i++)
        {
            if(mylist[i] > max) max = mylist[i];
        }
        System.out.println("Max:" + max);


    }
}
