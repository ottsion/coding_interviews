package 二叉搜索树的后序遍历序列;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 */
public class Solution {

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        else if(sequence.length<=3)
            return true;
        return Verify(sequence, 0, sequence.length-1);

    }

    private static boolean Verify(int[] sequence, int startIndex, int endIndex) {
        if (endIndex - startIndex <= 1)
            return true;
        int point = sequence[endIndex];
        boolean flag = true;
        int index = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (sequence[i] < point && flag)
                index = i;
            else if (sequence[i] > point && flag)
                flag = !flag;
            else if (sequence[i] < point && !flag)
                return false;
        }
        return Verify(sequence, startIndex, index) && Verify(sequence, index+1, endIndex);
    }

    public static void main(String[] args) {
        int[] a = {5,7,6,11,21,19,13,8};
        System.out.println(VerifySquenceOfBST(a));
    }
}