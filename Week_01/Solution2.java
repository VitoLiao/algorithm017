package Week_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



class Solution2 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return res;
    }

    public static void dfs(TreeNode root, int num, int sum) {
        if(root == null) return;
        num += root.val;
        list.add(root.val);
        if(num == sum && root.left == null && root.right == null) res.add(new ArrayList(list));
        dfs(root.left, num, sum);
        dfs(root.right, num, sum);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right = new TreeNode(8);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(5);
        node.right.right.right = new TreeNode(1);

        System.out.println(pathSum(node, 22));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
