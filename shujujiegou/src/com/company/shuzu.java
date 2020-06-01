package com.company;

import java.sql.Array;
import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
       //解决数组的长度不可变的问题
       int [] arr = new int[]{9,8,7};
       //快速查看数组
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素
        int d = 6;
        //创建一个新的数组
        int [] arr2 =new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=d;
        arr=arr2;
        System.out.println(Arrays.toString(arr));
    }
}