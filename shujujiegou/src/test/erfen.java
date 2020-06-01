package test;

public class erfen {
    public static void main(String[] args) {
        int [] ints = {1,2,5,6,7,8};
        System.out.println( erfen(ints,9));
    }
    public static int erfen(int [] num,int target){
        int h = num.length-1;
        int l = 0;
        int index = -1;
        int m = l+(h-l)/2;
        while(l<h){
            if (num[m]==target){
                index=m;
                return index;
            }else if (num[m]<target){
                l=m+1;
            }else {
                h=m-1;
            }
            m=l+(h-l)/2;
        }
        return index;
    }
}
