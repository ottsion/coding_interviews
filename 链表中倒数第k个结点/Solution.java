package 链表中倒数第k个结点;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode ans = head;
        if(head==null || k==0)
            return null;
        while(k>1) {
            head = head.next;
            if(head==null)
                return null;
            k--;
        }
        while(head.next!=null){
            ans = ans.next;
            head = head.next;
        }
        return ans;
    }

}
