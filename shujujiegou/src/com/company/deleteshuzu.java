package com.company;

import java.util.Arrays;

public class deleteshuzu {
    public static void main(String[] args) {
        //如何删除数组中的元素
        //目标数组
        int [] arr = new int[]{9,8,7,6,5,4};
        System.out.println(Arrays.toString(arr));
        //要删除的索引
        int index = 3;
        //创建一个新的数组
//        int [] arr2 = new int[arr.length-1];
//        for (int i = 0;i<arr2.length;i++){
//            if (i<index){
//               arr2[i]=arr[i];
//            }else {
//                arr2[i]=arr[i+1];
//            }
//        }
        //arr=arr2;
        System.out.println(Arrays.toString(arr));

    }
}
