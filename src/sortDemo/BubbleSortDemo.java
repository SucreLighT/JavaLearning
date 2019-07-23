package sortDemo;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 08:43
 * @description https://www.runoob.com/w3cnote/sort-algorithm-summary.html
 */

/*
    冒泡排序算法
    依次比较两个相邻的数，大的下沉小的上浮
    经过第一轮比较后，将最小的数交换到第一位
    经过第二轮比较后，将第二小的数交换到第二位
    ......
    经过n-1轮后排序结束

    优化：当某一轮比较中为发生交换，说明之后的数组已经是有序，直接跳出循环结束比较
 */

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 8, 5, 9};
        System.out.print("排序前：");
        showArray(arr);
        System.out.println("\n==================================");
        BubbleSort(arr);
        System.out.print("排序后：");
        showArray(arr);
    }

    public static void BubbleSort(int [] arr){
        int temp;
        boolean flag;
        for(int i=0; i<arr.length-1; i++){
            // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            flag = false;

            //从数组末尾向前比较的好处是避免判断下标是否越界
            for(int j=arr.length-1; j>i; j--){
                if(arr[j] < arr[j-1]){  //后一个数较小，小的数上浮
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;        //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if(!flag) break;
        }
    }

    public static void showArray(int[]arr){
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
