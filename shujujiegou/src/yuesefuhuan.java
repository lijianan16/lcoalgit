import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class yuesefuhuan {
    public static void main(String[] args) {

                yuese(5,3);
    }
    public static void yuese(int peoplenum,int k){
        Queue<Integer> queue = new LinkedList<>();
        int count=0;
        for (int i =0;i<peoplenum;i++){
            queue.add(i+1);
        }
        while(!queue.isEmpty()){
            Integer integer = queue.poll();
            count++;
            if (count%k==0){
                System.out.println(integer);
            }else {
                queue.add(integer);
            }
        }
    }


}
