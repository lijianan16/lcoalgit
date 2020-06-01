package com.company;

public class teststack {
    public static void main(String[] args) {
        //创建一个栈
        zhanstack stack = new zhanstack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());

    }
}
