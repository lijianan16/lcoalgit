package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr1 = new int[3];
        //获取数组长度
        int length = arr1.length;
        System.out.println(length);
        //访问数组中的元素
        int e = arr1[2];
        arr1[2]=99;
        System.out.println(e);
        //遍历数组
        arr1[0]=88;
        arr1[1]=77;
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        //创建数组的同时为数组中的元素赋值
        int []arr2 = {1,23,4};
       int l = arr2.length;
    }
}
