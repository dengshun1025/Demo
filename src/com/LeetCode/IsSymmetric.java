package com.LeetCode;

import java.util.ArrayList;

/**
 * 101. Symmetric Tree
 * Created by dengshun on 16-9-5.
 */


public class IsSymmetric {

    private static boolean isSymmetric(TreeNode root) {
        return root==null||isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode tree1,TreeNode tree2){
        if(tree1==null&&tree2==null)
            return true;
        else if(tree1==null||tree2==null)
            return false;
        return tree1.val == tree2.val&&isSymmetric(tree1.left,tree2.right)&&isSymmetric(tree1.right,tree2.left);
    }

    private static void inorder(TreeNode root, ArrayList<Integer> ret){
        if(root == null)
            return;
        if(root.left!=null)
            inorder(root.left, ret);
        ret.add(root.val);
        if(root.right!=null)
            inorder(root.right, ret);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        ArrayList<Integer> ret = new ArrayList<>();
        inorder(root,ret);
        System.out.println(isSymmetric(root)+"  "+ret);
    }
}