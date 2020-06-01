package test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class test1 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,5,2,4,6,8,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
   public static void mergeSort(int [] arr,int l,int r){
        if (l==r){
            return;
        }
        int m = l + ((r - l) >> 1);
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
   }
   public static void merge(int [] arr,int l,int mid,int r){
        int [] help = new int[r-l+1];
        int low = l;
        int m = mid+1;
        int i=0;
        while (l<=mid&&m<=r){
            if (arr[low]<arr[m]){
                help[i]=arr[low];
                low++;

            }else {
                help[i]=arr[m];
                m++;

            }
            i++;
        }

        while (m<=r){
            help[i]=arr[m];
            m++;
            i++;
        }
       while(low<=mid){
           help[i]=arr[l];
           l++;
           i++;
       }

        for (i=0;i<help.length;i++){
            arr[l+i]=help[i];
        }

   }

}
