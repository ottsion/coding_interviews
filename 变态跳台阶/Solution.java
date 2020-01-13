package 变态跳台阶;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

public class Solution {
    public static int JumpFloorII(int target) {
        if (target <= 0) return 0;
        return (int) Math.pow(2, target - 1);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }
}
