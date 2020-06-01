package com.company;

public class testloopNode {
    public static void main(String[] args) {
        loopNode n1 = new loopNode(1);
        loopNode n2 = new loopNode(2);
        loopNode n3 = new loopNode(3);
        n1.after(n2);
        n1.after(n3);
        System.out.println(n1.next().next().next().getData());

    }




}
