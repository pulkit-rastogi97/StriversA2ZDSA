package Trees;

import java.util.*;

import utilities.TreeNode;


public class VerticalOrderTraversal {

    static class TreeNodeCoOrd{
        TreeNode node;
        Integer vertical;
        Integer level;

        public TreeNodeCoOrd(TreeNode node, Integer vertical, Integer level){
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }

    public static List<List<Integer>> verticalTraversal_V1(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNodeCoOrd> queue = new LinkedList<>();
        queue.offer(new TreeNodeCoOrd(root, 0, 0));

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> resultDS = new TreeMap<>();

        while(!queue.isEmpty()){
            TreeNodeCoOrd treeNodeCoOrd = queue.poll();
            TreeNode node = treeNodeCoOrd.node;
            if(node.left != null){
                queue.offer(new TreeNodeCoOrd(node.left,
                        treeNodeCoOrd.vertical - 1,
                        treeNodeCoOrd.level + 1));
            }

            if(node.right != null){
                queue.offer(new TreeNodeCoOrd(node.right,
                        treeNodeCoOrd.vertical + 1,
                        treeNodeCoOrd.level + 1));
            }

            if(resultDS.containsKey(treeNodeCoOrd.vertical)){
                TreeMap<Integer, PriorityQueue<Integer>> valueMap = resultDS.get(treeNodeCoOrd.vertical);
                if(valueMap.containsKey(treeNodeCoOrd.level)){
                    valueMap.get(treeNodeCoOrd.level).offer(node.val);
                }else{
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.offer(node.val);
                    valueMap.put(treeNodeCoOrd.level, pq);
                }
            }else{
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.offer(node.val);
                TreeMap<Integer, PriorityQueue<Integer>> valueMap = new TreeMap<>();
                valueMap.put(treeNodeCoOrd.level, pq);
                resultDS.put(treeNodeCoOrd.vertical, valueMap);
            }
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> valueMap : resultDS.values()){
            List<Integer> verticalList = new ArrayList<>();
            for(PriorityQueue<Integer> pq : valueMap.values()){
                while(!pq.isEmpty()){
                    verticalList.add(pq.poll());
                }
            }
            result.add(verticalList);
        }
        return result;
    }

    public static List<List<Integer>> verticalTraversal_V2(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNodeCoOrd> queue = new LinkedList<>();
        queue.offer(new TreeNodeCoOrd(root, 0, 0));

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> resultDS = new TreeMap<>();

        while(!queue.isEmpty()){
            TreeNodeCoOrd treeNodeCoOrd = queue.poll();
            TreeNode node = treeNodeCoOrd.node;
            if(node.left != null){
                queue.offer(new TreeNodeCoOrd(node.left,
                        treeNodeCoOrd.vertical - 1,
                        treeNodeCoOrd.level + 1));
            }

            if(node.right != null){
                queue.offer(new TreeNodeCoOrd(node.right,
                        treeNodeCoOrd.vertical + 1,
                        treeNodeCoOrd.level + 1));
            }

            //Optimized way of writing code
            resultDS.putIfAbsent(treeNodeCoOrd.vertical, new TreeMap<>());
            resultDS.get(treeNodeCoOrd.vertical).putIfAbsent(treeNodeCoOrd.level, new PriorityQueue<>());
            resultDS.get(treeNodeCoOrd.vertical).get(treeNodeCoOrd.level).offer(node.val);
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> valueMap : resultDS.values()){
            List<Integer> verticalList = new ArrayList<>();
            for(PriorityQueue<Integer> pq : valueMap.values()){
                while(!pq.isEmpty()){
                    verticalList.add(pq.poll());
                }
            }
            result.add(verticalList);
        }
        return result;
    }
}
