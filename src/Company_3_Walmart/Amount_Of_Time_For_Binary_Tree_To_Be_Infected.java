package Company_3_Walmart;
import java.util.*;
// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description
public class Amount_Of_Time_For_Binary_Tree_To_Be_Infected {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    Map<Integer, Set<Integer>> map = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        convert(root,0,map);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();
        vis.add(start);
        queue.offer(start);
        int count = 0;
        while (!queue.isEmpty()){
            count++;
            int size = queue.size();
            while (size-- > 0){
                int curr = queue.poll();

                for(int num : map.get(curr)){
                    if (!vis.contains(num)) {
                        vis.add(num);
                        queue.add(num);
                    }
                }
            }
        }
        return count - 1;
    }
    void convert(TreeNode node,int parent,Map<Integer, Set<Integer>> map){
        if(node == null) return;
        if(!map.containsKey(node.val)){
            map.put(node.val,new HashSet<>());
        }
        Set<Integer> temp = map.get(node.val);
        if(parent != 0){
            temp.add(parent);
        }
        if(node.left != null){
            temp.add(node.left.val);
        }
        if(node.right != null){
            temp.add(node.right.val);
        }
        convert(node.left,node.val,map);
        convert(node.right,node.val,map);
    }
}
