package com.LeetCode;

import java.util.ArrayList;

/**
 * @author dengshun 226
 * Created by dengshun on 16-9-10.
 */

public class InvertBinaryTree {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(invertTree(root).val);
        System.out.println(InvertBinaryTree.class);
    }

    private static TreeNode invertTree(TreeNode root) {
        TreeNode  temp;
        if(root==null)
            return null;
        if(root.left!=null||root.right!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

