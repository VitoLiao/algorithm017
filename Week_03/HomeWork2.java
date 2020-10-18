package Week_03;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class HomeWork2 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length != inorder.length)
            return null;

        int n = inorder.length;

        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);

    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int preleft, int preright, int orderleft, int orderright) {
        if (preleft > preright || orderleft > orderright)
            return null;

        TreeNode root = new TreeNode(preorder[preleft]);
        int index = indexMap.get(root.val);

        root.left = myBuildTree(preorder, inorder, preleft + 1, preleft + index - orderleft, orderleft, index - 1);

        root.right = myBuildTree(preorder, inorder, preleft + index - orderleft + 1, preright, index + 1, orderright);

        return root;


    }
}