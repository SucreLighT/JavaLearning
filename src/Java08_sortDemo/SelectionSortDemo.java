package Java08_sortDemo;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 09:11
 * @description https://www.runoob.com/w3cnote/sort-algorithm-summary.html
 */

/*
    选择排序算法
    第一轮假设第一位元素为最小，从后n-1的元素遍历并与第一个元素比较交换，选出最小的元素放在第一位；
    第二轮选出第二小的放在第二位
    ......
 */

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 8, 5, 9};
        System.out.print("排序前：");
        showArray(arr);
        System.out.println("\n==================================");
        SelectionSort(arr);
        System.out.print("排序后：");
        showArray(arr);
    }

    public static void SelectionSort(int[] arr){
        int minIndex;
        for(int i=0; i<arr.length-1;i++){
            minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){  //当前一轮中最小的元素下标发生变化
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void showArray(int[]arr){
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
