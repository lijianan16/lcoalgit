package com.company;

import java.util.Arrays;

public class mianxiangduixshuzu {
//用于存储一个可变的数组
    private int [] elments;
public mianxiangduixshuzu(){
    elments=new int[0];
}
//获取数组长度的方法
    public int size(){
    return elments.length;
    }
    //往数组末尾添加一个元素
    public void add(int element){
    int [] newarr = new int[elments.length+1];
    for (int i = 0;i<elments.length;i++){
        newarr[i] = elments[i];
    }
    newarr[elments.length]=element;
    //替换数组
        elments=newarr;
    }
    //打印数组到控制台
    public void show(){
        System.out.println(Arrays.toString(elments));
    }
    //删除数组中的元素
    public void delete(int index){
    if(index>elments.length||index<0){
        throw new RuntimeException("下表越界");
    }
    int [] newarr = new int[elments.length-1];
    for (int i = 0;i<newarr.length;i++){
        if (i<index){
            newarr[i]=elments[i];
        }else {
            newarr[i]=elments[i+1];
        }
    }
    elments=newarr;
    }
    //取出指定位置的元素
    public int get(int index){
        if(index>elments.length||index<0){
            throw new RuntimeException("下表越界");
        }
        int element = elments[index];
    return element;
    }
    //插入一个元素到指定位置
    public void insert(int index,int element){
        if(index>elments.length||index<0){
            throw new RuntimeException("下表越界");
        }
    int [] newarr = new int[elments.length+1];
    for (int i = 0;i<elments.length;i++){
        if(i<index){
            newarr[i] = elments[i];
        }else {
            newarr[i+1]=elments[i];
        }
    }
        newarr[index]=element;
        elments=newarr;
    }
    //替换指定位置的元素
    public void set(int index,int element){
        if(index>elments.length||index<0){
            throw new RuntimeException("下表越界");
        }
    elments[index]=element;
    }
    //线性查找
    public int search(int target){
       for (int i=0;i<elments.length;i++) {
           if ( elments[i]== target){
               return i;
           }
       }
       return -1;
    }
    //二分法查找
    public int binarySearch(int target){

        //记录开始位置
        int begin = 0;
        //记录技术位置
        int end = elments.length-1;
        //记录目标位置
        int index = -1;
        //记录中间位置
        int mid = (begin+end)/2;
        //循环查找
        while(true){
            //开始位置和结束位置重合
            if(begin>=end){
                return -1;
            }
            if(elments[mid]==target){
                index=mid;
                return index;
            }else {
                //如果目标元素大于中间值
                if (target>elments[mid]){
                    //改变开始值
                    begin=mid+1;
                }else{
                    //改变结尾值
                    end=mid-1;
                }
            }
            mid=(begin+end)/2;
        }

    }
}
