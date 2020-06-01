package com.company;

public class zhanstack {
    //栈的底层我们使用数组来存储数据
    int[] elements;

    public zhanstack(){
        elements=new int[0];
    }

    //压入元素
    public void push(int element){
        int [] newArr = new int[elements.length+1];
        for (int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        //将新的元素赋值给新数组的最后一位
        newArr[elements.length]=element;
        elements=newArr;
    }

    //取出栈顶元素
    public int pop(){
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length-1];
        //创建一个新的数组
        int [] newArr = new int[elements.length-1];
        //愿数组中除了最后一个元素的其他元素都放入新的数组中
        for (int i=0;i<newArr.length;i++){
            newArr [i]=elements[i];
        }
        //替换数组
        elements=newArr;
        //返回栈顶元素
        return element;
    }
    //显示栈顶元素
    public int peek(){
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length-1];
        return element;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }

}
