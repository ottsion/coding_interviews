package 栈的压入弹出序列;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */


public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int indexPushA = 0;
        int indexPopA = 0;
        stack.push(pushA[indexPushA++]);
        while(!stack.isEmpty()){
            if(indexPopA==popA.length)
                return false;
            else if(stack.peek() == popA[indexPopA]){
                stack.pop();
                indexPopA++;
            }
            else if(indexPushA<pushA.length)
                stack.push(pushA[indexPushA++]);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};  //1,2,3,4,5],[4,5,3,2,1]
        int[] b = {4,5,3,2,1};
        System.out.println(IsPopOrder(a, b));
    }
}
