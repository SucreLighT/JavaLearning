package sortDemo;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Integer arr[] = {2, 4, 7, 6, 8, 5, 9};
        for (int x : arr) {
            System.out.println(x + " ");
        }
        System.out.println("=========");
        Sort(arr);
    }

    public static void Sort(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
