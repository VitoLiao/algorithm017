package Week_03;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class HomeWork1 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //利用hash表，将每个节点的父节点信息存储起来，然后分别从p和qu往上找，找到第一个公共节点即为最近公共祖先
    Map<Integer, TreeNode> fatherNodeMap = new HashMap<>();
    Set<Integer> vistied = new HashSet<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);

        while (p != null) {
            vistied.add(p.val);
            p = fatherNodeMap.get(p.val);
        }

        while (q != null) {
            if (vistied.contains(q.val))
                return q;
            q = fatherNodeMap.get(q.val);
        }

        return null;

    }

    public void dfs(TreeNode root) {
        if (root.left != null) {
            fatherNodeMap.put(root.left.val, root);
            dfs(root.left);
        }

        if (root.right != null) {
            fatherNodeMap.put(root.right.val, root);
            dfs(root.right);
        }
    }
}
