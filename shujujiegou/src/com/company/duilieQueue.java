package com.company;

import java.util.Arrays;

public class duilieQueue {
    int [] elements;
    public duilieQueue(){
        elements=new int[0];
    }
    //入队
    public void add(int element){
        int [] arrNew = new int[elements.length+1];
        for(int i=0;i<elements.length;i++){
            arrNew[i]=elements[i];
        }
        arrNew[elements.length]=element;
        elements=arrNew;
    }
    //出队操作
    public void poll(){
        if (elements.length==0){
            throw new RuntimeException("数组长度为0");
        }
        int [] arrNew = new int[elements.length-1];
        for(int i=0;i<arrNew.length;i++){
            arrNew[i]=elements[i+1];
        }
        elements=arrNew;
    }
    //展示队列
    public void show(){
        System.out.println(Arrays.toString(elements));
    }


}
