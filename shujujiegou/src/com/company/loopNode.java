package com.company;

public class loopNode {
    int data;
    loopNode next=this;
    public loopNode(int data){
        this.data=data;
    }
    //为节点追加节点
//    public void append( loopNode node){
//        //当前节点
//        loopNode currentNode = this;
//        //循环向后找
//        while(true){
//            //取出下一个节点
//            loopNode nextNode = currentNode.next;
//            //判空
//            if (nextNode==null){
//                break;
//            }
//            //赋给当前节点
//            currentNode = nextNode;
//        }
//        currentNode.next=node;
//    }
    //删除下一个节点
    public void removeNext(){
        //首先获取下下个节点
        loopNode newNext = this.next.next;
        //把下下节点赋值给当前节点的下一个节点
        this.next=newNext;
    }
    //获取下一个节点
    public loopNode next(){
        return this.next;
    }
    //获取节点中的数据
    public int getData(){
        return this.data;
    }
    //当前节点是否是最后一个节点
    public boolean islast(){
        if(this.next==null){
            return true;
        }else {
            return false;
        }
    }
    //插入一个节点
    public void after(loopNode node){
        loopNode nextNode = this.next;
        this.next=node;
        node.next=nextNode;

    }

//    //显示链表
//    public void show(){
//        loopNode currentNode = this;
//        while(true){
//            System.out.println(currentNode.data+" ");
//            //取出下一个节点
//            currentNode=currentNode.next;
//            if (currentNode==null){
//                break;
//            }
//        }
//    }
}



