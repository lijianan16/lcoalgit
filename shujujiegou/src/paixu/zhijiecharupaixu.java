package paixu;

import java.util.Arrays;

public class zhijiecharupaixu {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,2,8,5,9,1,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int [] arr){
        int temp =0;
        for (int i=1;i<arr.length;i++){
            //如果当前数字比前一个数字小
            if(arr[i]<arr[i-1]){
               temp = arr[i];
               int j;
               for ( j=i-1;j>=0&&temp<arr[j];j--){
                   arr[j+1]=arr[j];
               }
               arr[j+1]=temp;
            }

        }
    }
}
