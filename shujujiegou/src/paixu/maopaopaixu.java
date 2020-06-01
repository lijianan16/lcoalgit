package paixu;

import java.util.Arrays;

public class maopaopaixu {
    public static void main(String[] args) {
        int [] ints = new int[]{9,8,7,6,5};
      swap(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static void swap(int [] ints){
        int [] ints1=ints;
        int temp=0;
        //控制比较多少轮的
        for (int i=0;i<ints1.length-1;i++){
            //比较次数
           for (int j=0;j<ints1.length-1-i;j++){
              if (ints1[j]>ints1[j+1]){
               temp=ints1[j];
               ints1[j]=ints1[j+1];
               ints1[j+1]=temp;
              }
           }
            }

        }


    }

