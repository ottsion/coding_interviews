package 二叉搜索树与双向链表;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
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
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        TreeNode pre = null;
        TreeNode res = mid(pRootOfTree, pre);
        while(res.left!=null)
            res = res.left;
        return res;
    }
    public TreeNode mid(TreeNode node, TreeNode pre){
        TreeNode cur = node;
        if(cur==null) {
            return pre;
        }
        pre = mid(cur.left, pre);
        if(pre!=null){
            cur.left = pre;
            pre.right = cur;
        }
        pre = cur;
        pre = mid(cur.right, pre);
        return pre;
    }
}