package Company_6_Goldman_sachs;

public class Maximum_Sum_BST {
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
    class Solution {
        int maxSum = 0;
        class Pair {
            int min, max, sum;
        }
        public Pair ans(TreeNode root){
            if(root == null){
                Pair a = new Pair();
                a.min = Integer.MAX_VALUE;
                a.max = Integer.MIN_VALUE;
                a.sum = 0;
                return a;
            }
            Pair main = new Pair();
            Pair left = ans(root.left);
            Pair right = ans(root.right);

            if(left.max < root.val && root.val < right.min){
                main.min = Math.min(root.val, Math.min(left.min, right.min));
                main.max = Math.max(root.val, Math.max(left.max, right.max));
                main.sum = root.val + left.sum + right.sum;
                maxSum = Math.max(maxSum,main.sum);
            }
            else{
                main.min = Integer.MIN_VALUE;
                main.max = Integer.MAX_VALUE;
                main.sum = Math.max(left.sum,right.sum);
            }
            return main;
        }
        public int maxSumBST(TreeNode root) {
            Pair temp = new Pair();
            temp = ans(root);
            return maxSum > 0 ? maxSum : 0;
        }
    }
}
