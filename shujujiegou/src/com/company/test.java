package com.company;

public class test {
    public static void main(String[] args) {
        mianxiangduixshuzu m = new mianxiangduixshuzu();
        m.add(99);
        m.delete(0);
        m.add(88);
        m.add(87);
        m.add(89);
       // m.set(0,5);
       // m.size();
        System.out.println(m.size());
       int a= m.binarySearch(90);
        System.out.println(a);
        m.show();


    }
}
