public class digui {
    public static int getMax(int [] arr,int L,int R){
        if (L==R){
            return arr[L];
        }
        int mid = (L+R)/2;
        int maxLeft = getMax(arr,L,mid);
        System.out.println(maxLeft);
        int maxRight = getMax(arr,mid+1,R);
        System.out.println(maxRight);
        return Math.max(maxLeft,maxRight);
    }

    public static void main(String[] args) {
        int [] arr = {3,5,7,4};
       int max =getMax(arr,0,arr.length-1);
        System.out.println(max);
    }
}
