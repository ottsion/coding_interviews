package 反转链表;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public static ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode ansHead = new ListNode(head.val);
        while(head.next!=null){
            ListNode temp = new ListNode(head.next.val);
            temp.next = ansHead;
            ansHead = temp;
            head = head.next;
        }
        return ansHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        ListNode ans = ReverseList(node);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }

}
