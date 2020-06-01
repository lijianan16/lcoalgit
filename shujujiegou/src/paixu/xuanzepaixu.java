package paixu;

import java.util.Arrays;

public class xuanzepaixu {
    public static void main(String[] args) {
        int [] arr = new int[]{3,4,5,7,1,2,0,3,6,8};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectSort(int[] arr ){
        //遍历所有的数
        for (int i=0;i<arr.length;i++){
            int minindex = i;
            //把当前遍历的数和后面所有的数依次进行比较，并记录下最小数的下标
            for (int j =i+1; j <arr.length ; j++) {
                    if (arr[minindex]>arr[j]){
                        minindex=j;
                    }
            }
            //如果最小的数和当前遍历数的下标不一致，说明下标为minIndex的数比当前遍历的数更小
            if (i!=minindex){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
    }
