package 树的子结构;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
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

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        String line1 = getPreList(root1);
        String line2 = getPreList(root2);
        System.out.println("================");
        System.out.println(line1);
        System.out.println(line2);
        return line1.contains(line2);
    }

    private String getPreList(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        pre(root, sb);
        return sb.toString();
    }

    private void pre(TreeNode root, StringBuilder sb) {
        if(root!=null){
            sb.append(root.val);
            pre(root.left, sb);
            pre(root.right, sb);
        }
    }
}
