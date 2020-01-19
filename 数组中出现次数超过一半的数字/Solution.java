package 数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {

    public int MoreThanHalfNum_Solution(int [] array) {

        if(array.length==0)
            return 0;
        Map<Integer, Integer> ans = new HashMap<>();
        int half = array.length/2;
        for(int i=0; i<array.length; i++){
            int count = ans.getOrDefault(array[i], 0);
            if(count==half)
                return array[i];
            else
                ans.put(array[i], count+1);
        }
        return 0;
    }
}
