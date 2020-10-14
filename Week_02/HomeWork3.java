package Week_02;

import java.util.ArrayList;
import java.util.List;

public class HomeWork3 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        func(root);
        return list;
    }

    public void func(Node root) {
        if (null == root)
            return;

        list.add(root.val);

        for (Node c: root.children)
            func(c);
    }
}
