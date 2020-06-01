package com.company;

public class feibonaqie {
    public static void main(String[] args) {
        //斐波那契数列：1，1，2，3，5，8，13
        System.out.println( febonacci(3));

    }
    public static int febonacci(int i){
        if (i==1||i==2){
            return 1;
        }else {
          return febonacci(i-1)+febonacci(i-2);
        }

    }
}
