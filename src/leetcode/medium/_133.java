package leetcode.medium;

import java.util.*;

public class _133 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }

        if(map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val);
        List<Node> list = new ArrayList<>();
        map.put(node, clone);

        for(Node n : node.neighbors) {
            Node c = cloneGraph(n);
            list.add(c);
        }

        clone.neighbors = list;

        return clone;
    }
}
