package com.company;

public class TestDoubleNode {
    public static void main(String[] args) {
        //创建节点
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        //
        n1.after(n2);
        n1.after(n3);
        System.out.println(n1.pre().getData());
        System.out.println(n1.getData());
        System.out.println(n1.next().getData());
    }
}
