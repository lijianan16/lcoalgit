package com.company;

public class testduiliequeue {
    public static void main(String[] args) {
        duilieQueue duilieQueue=new duilieQueue();
        duilieQueue.add(1);
        duilieQueue.add(2);
        duilieQueue.add(3);
        duilieQueue.poll();
        duilieQueue.poll();
        duilieQueue.poll();
        duilieQueue.poll();
        duilieQueue.show();

    }
}
