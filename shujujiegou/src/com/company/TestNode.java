package com.company;

public class TestNode {
    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2);
        n1.append(n3);
        //n1.removeNext();

      n1.show();
      //插入一个新节点
    Node node = new Node(4);
    n1.after(node);
    n1.show();
    }
}
