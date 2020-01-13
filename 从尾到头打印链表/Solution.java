package 从尾到头打印链表;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

import java.util.ArrayList;


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}


public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> ans = new ArrayList<>();
        while(listNode!=null){
            ans.add(0, listNode.val);
            listNode = listNode.next;
        }
        return ans;
    }

    public static void main(String[] args) {


    }
}
