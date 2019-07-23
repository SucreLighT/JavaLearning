package sortDemo;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 09:36
 * @description https://www.runoob.com/w3cnote/sort-algorithm-summary.html
 */

/*
    快速排序算法
    分治的思想
    从数组中选取一个数作为key
    将比这个数小的数放在它前面，比它大的数放在它后面
    对左右两个子序列重复以上步骤
 */

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 8, 5, 9};
        System.out.print("排序前：");
        showArray(arr);
        System.out.println("\n==================================");
        QuickSort(arr,0,arr.length-1);
        System.out.print("排序后：");
        showArray(arr);
    }

    public static void QuickSort(int a[],int l,int r){
        if(l>=r)
            return;
        int i = l; int j = r; int key = a[l];//选择第一个数为key

        while(i<j){
            while(i<j && a[j]>=key)//从右向左找第一个小于key的值
                j--;

            if(i<j){
                a[i] = a[j];
                i++;
            }

            while(i<j && a[i]<key)//从左向右找第一个大于key的值
                i++;
            if(i<j){
                a[j] = a[i];
                j--;
            }
        }
        a[i] = key;
        QuickSort(a, l, i-1);//递归调用
        QuickSort(a, i+1, r);//递归调用
    }

    public static void showArray(int[]arr){
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
