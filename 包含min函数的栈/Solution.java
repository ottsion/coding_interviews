package 包含min函数的栈;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

public class Solution {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private Stack<Integer> stack = new Stack();

    public void push(int node) {
        this.stack.push(node);
        minHeap.add(node);
    }

    public void pop() {
        int node = this.stack.pop();
        minHeap.remove(node);
    }

    public int top() {
        return this.stack.peek();
    }

    public int min() {
        return this.minHeap.peek();
    }
}
