package 二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null) {
            return ans;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        find(root, target, ans, temp);
        return ans;
    }

    private void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp) {
        if(target - root.val>=0){
            target = target - root.val;
            temp.add(root.val);
            if(target==0 && root.left==null && root.right==null){
                ans.add(new ArrayList<Integer>(temp));
            }
            else{
                if(root.left!=null)
                    find(root.left, target, ans, temp);
                if(root.right!=null)
                    find(root.right, target, ans, temp);
            }
            temp.remove(temp.size()-1);
        }
    }

}
