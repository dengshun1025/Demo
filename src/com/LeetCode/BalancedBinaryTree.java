package com.LeetCode;

/**
 *
 * Created by dengshun on 16-9-29.
 */
public class BalancedBinaryTree {

    public static void main(String[] args){
        TreeNode head = new TreeNode(1);
        TreeNode head1 = new TreeNode(2);
        TreeNode head2 = new TreeNode(3);
        TreeNode head3 = new TreeNode(2);
        TreeNode head4 = new TreeNode(1);
        head.left = head1;
        head.right = head2;
        head1.left = head3;
        head2.right = head4;
        System.out.println(isBalanced(head));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        System.out.println(maxLevel(root,0));
        System.out.println(minLevel(root,0));
        return maxLevel(root,0) - minLevel(root,0) <= 1;
    }

    private static int maxLevel(TreeNode root,int level){
        if(root != null){
            return Math.max(maxLevel(root.left,level) , maxLevel(root.right,level))+1;
        }
        return level;
    }

    private static int minLevel(TreeNode root,int level){
        if(root == null)
            return level;
        if(root.left!=null&&root.right!=null){
            return Math.min(maxLevel(root.left,level) , maxLevel(root.right,level))+1;
        }
        return level;
    }
}
