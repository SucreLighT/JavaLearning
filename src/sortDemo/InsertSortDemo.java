package sortDemo;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 09:26
 * @description
 */

/*
    插入排序算法
    数组分为前半部分有序和后半部分无序
    每一轮排序中，将后半部分中的数插入到前半部分的合适位置
 */
public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 8, 5, 9};
        System.out.print("排序前：");
        showArray(arr);
        System.out.println("\n==================================");
        InsertSort(arr);
        System.out.print("排序后：");
        showArray(arr);
    }

    public static void InsertSort(int[] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
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
