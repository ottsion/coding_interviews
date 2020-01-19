package 最小的K个数;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(input.length==0 || input.length<k) {
            return ans;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0; i<input.length; i++)
            queue.add(input[i]);
        for(int i=0; i<k; i++){
            ans.add(queue.poll());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> ans = GetLeastNumbers_Solution(a, 4);
        for(int i: ans)
            System.out.println(i);
    }
}
