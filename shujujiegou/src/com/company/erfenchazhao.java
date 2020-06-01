package com.company;

public  class  erfenchazhao {
    public static void main(String[] args) {
        //目标数组
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        //目标元素
        int target = 8;
        //记录开始位置
        int begin = 0;
        //记录技术位置
        int end = arr.length-1;
         //记录目标位置
        int index = -1;
        //记录中间位置
        int mid = (begin+end)/2;
        //循环查找
        while(true){
            if(arr[mid]==target){
                index=mid;
                break;
            }else {
                //如果目标元素大于中间值
                if (target>arr[mid]){
                    //改变开始值
                    begin=mid+1;
                }else{
                    //改变结尾值
                    end=mid-1;
                }
            }
            mid=(begin+end)/2;
        }
        System.out.println(index);
    }
}
