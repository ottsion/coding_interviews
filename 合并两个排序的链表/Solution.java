package 合并两个排序的链表;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null || list2==null)
            return list1==null?list2:list1;
        // 保证list1起始位置最小
        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode head = list1;
        while(list1.next!=null && list2!=null){
            if(list1.next.val>=list2.val){
                ListNode p = new ListNode(list2.val);
                p.next = list1.next;
                list1.next = p;
                list2 = list2.next;
            }
            list1 = list1.next;
        }
        while(list2!=null){
            list1.next = list2;
            list1 = list1.next;
            list2 = list2.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(6);
        ListNode ans = Merge(node, node1);
        System.out.println("---------");
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
}
