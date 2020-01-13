package 重建二叉树;

import java.util.HashMap;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class Solution {

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length==0)
            return null;
        TreeNode node = getTreeNode(pre, 0, pre.length-1, in, 0, in.length-1);
        return node;
    }

    private static TreeNode getTreeNode(int[] pre, int preStartIndex, int preEndIndex, int[] in, int inStartIndex, int inEndIndex) {
        if(preStartIndex>preEndIndex || inStartIndex>inEndIndex){
            return null;
        }
        TreeNode node = new TreeNode(pre[preStartIndex]);
        for(int i = inStartIndex; i<=inEndIndex; i++){
            if(pre[preStartIndex] == in[i]){
                node.left = getTreeNode(pre, preStartIndex+1, preStartIndex+i-inStartIndex, in, inStartIndex, i-1);
                node.right = getTreeNode(pre, i-inStartIndex+preStartIndex+1, preEndIndex, in, i+1, inEndIndex);
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,3,5,6};
        int[] in = {4,2,1,5,3,6};
        TreeNode ans = reConstructBinaryTree(pre, in);
        System.out.println("111");
    }
}
