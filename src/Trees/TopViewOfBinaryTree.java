package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

    static class Plot{
        TreeNode node;
        Integer vertical;

        public Plot(TreeNode node, Integer vertical){
            this.node = node;
            this.vertical = vertical;
        }
    }

    // Function to return a list of TreeNodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> topList = new ArrayList<Integer>();

        if(root == null){
            return topList;
        }

        Queue<Plot> queue = new LinkedList<Plot>();
        queue.offer(new Plot(root, 0));

        TreeMap<Integer, Integer> map = new TreeMap<>();

        while(!queue.isEmpty()){
            Plot plot = queue.poll();
            TreeNode node = plot.node;
            Integer vertical = plot.vertical;

            if(node.left != null){
                queue.offer(new Plot(node.left, vertical - 1));
            }

            if(node.right != null){
                queue.offer(new Plot(node.right, vertical + 1));
            }

            map.putIfAbsent(vertical, node.val);
        }

        topList.addAll(map.values());

        return topList;
    }
}
