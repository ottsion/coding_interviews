package 复杂链表的复制;

import java.util.ArrayList;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        ArrayList<RandomListNode> back = new ArrayList<>();
        RandomListNode p = pHead;

        RandomListNode head = new RandomListNode(p.label);
        p = p.next;
        back.add(head);
        RandomListNode round1 = head;
        RandomListNode round2 = head;

        while(p!=null){
            RandomListNode t = new RandomListNode(p.label);
            round1.next = t;
            back.add(t);
            p = p.next;
            round1 = round1.next;
        }
        while(pHead!=null){
            if(pHead.random!=null){
                round2.random = search(back, pHead.random);
            }
            pHead = pHead.next;
            round2 = round2.next;
        }
        return head;
    }

    private RandomListNode search(ArrayList<RandomListNode> back, RandomListNode random) {
        for(int i=0; i<back.size(); i++){
            if(back.get(i).label == random.label)
                return back.get(i);
        }
        return new RandomListNode(random.label);

    }
}
