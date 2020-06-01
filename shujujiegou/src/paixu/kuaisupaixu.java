package paixu;

import java.util.Arrays;

public class kuaisupaixu {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,5,11};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //把数组中的第0个数组作为标准数
            int stard = arr[start];
            //记录需要排序的下标
            int low = start;
            int hign = end;
            //循环比标准数大的数和比标准数小的数
            while (low < hign) {
                //右边的数字比标准数大
                while (low < hign && stard <= arr[hign]) {
                    hign--;
                }
                //使用右边的数字替换左边数字
                arr[low] = arr[hign];
                //如果左边的数字比标准数小
                while (low < hign && arr[low] <= stard) {
                    low++;
                }
                arr[hign] = arr[low];
            }
            //把标准数赋给低所在的位置元素
            arr[low] = stard;
            //处理所有小的数字
            quickSort(arr, start, low);
            //处理所有大的数字
            quickSort(arr, low + 1, end);
        }
    }

}