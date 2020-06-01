import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        ReentrantLock reentrantLock;
    }
}
class Solution{
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        if(k>stack.size()){
            return null;
        }
        while(k>1){
            stack.pop();
            k--;
        }
        return stack.pop();

    }
}