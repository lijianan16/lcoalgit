package com.company;

public class hannuota {
    public static void main(String[] args) {
  hanoi(3,'A','B','C');
    }
    //n:共有n个数，from：开始的柱子，in：中间的柱子，to：目标柱子
    public static void  hanoi(int n,char from,char in,char to){
        //只有一个盘子
        if(n==1){
            System.out.println("第一个盘子从"+from+"移到"+to);
        }else{
            //先将上面的所有盘子放到中间
            hanoi(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移动"+to);
            //把上面的所有盘子从中间位置移动到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
