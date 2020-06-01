package com.company;

public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点数据
    int data;

    public DoubleNode( int data){
        this.data=data;
    }
    //增加节点
    public void after( DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNode = this.next;
        //把新节点做为当前节点的下一个节点
        this.next=node;
        //把当前节点做新节点的前一个节点
        node.pre=this;
        //让原来的下一个节点做新节点的下一个节点
        node.next=nextNode;
        //让原来的下一个节点的上一个节点为新节点
        nextNode.pre=node;
    }
    //获取下一个节点
    public DoubleNode next(){
        return this.next;
    }
    //获取上一个节点
    public DoubleNode pre(){
        return this.pre;
    }
    public int getData(){
        return data;
    }
}
