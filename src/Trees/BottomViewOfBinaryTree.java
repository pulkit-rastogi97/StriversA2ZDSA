package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    static class Plot{
        TreeNode node;
        Integer vertical;

        public Plot(TreeNode node, Integer vertical){
            this.node = node;
            this.vertical = vertical;
        }
    }

    static ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> topList = new ArrayList<Integer>();

        if(root == null){
            return topList;
        }

        Queue<TopViewOfBinaryTree.Plot> queue = new LinkedList<TopViewOfBinaryTree.Plot>();
        queue.offer(new TopViewOfBinaryTree.Plot(root, 0));

        TreeMap<Integer, Integer> map = new TreeMap<>();

        while(!queue.isEmpty()){
            TopViewOfBinaryTree.Plot plot = queue.poll();
            TreeNode node = plot.node;
            Integer vertical = plot.vertical;

            if(node.left != null){
                queue.offer(new TopViewOfBinaryTree.Plot(node.left, vertical - 1));
            }

            if(node.right != null){
                queue.offer(new TopViewOfBinaryTree.Plot(node.right, vertical + 1));
            }

            map.put(vertical, node.val);
        }

        topList.addAll(map.values());

        return topList;
    }
}
