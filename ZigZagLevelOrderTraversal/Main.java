package com.trees.main;

import com.trees.node.TreeNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        List<List<Integer>> list = zigzagLevelOrderTraversal(root);
        System.out.println(list);


    }

   

    //zigzag-level order traversal my version
    public static List<List<Integer>> zigzagLevelOrderTraversal(TreeNode root){
        List<List<Integer>> finalList = new ArrayList<>();
        if(root == null)return finalList;
        Queue<TreeNode> queue= new LinkedList();
        queue.add(root);
        boolean isZigZag=false;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int queueSize= queue.size();
            for(int i=0;i<queueSize;i++){
                TreeNode temp= queue.poll();
                list.add(temp.value);


                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            if(isZigZag){
                System.out.print("inside zigzag:"+isZigZag);
                Collections.reverse(list); // this uses O(n) time
                System.out.println("after reveresal"+list);

            }

            isZigZag=!isZigZag;
         finalList.add(list);
        }

        return finalList;
    }
    //zigzag-level order traversal - efficient version
    public static List<List<Integer>> zigzagLevelOrderTraversalTwo(TreeNode root){
        List<List<Integer>> finalList = new ArrayList<>();
        if(root == null)return finalList;
        Queue<TreeNode> queue= new LinkedList();
        queue.add(root);
        boolean isZigZag=false;
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int queueSize= queue.size();
            for(int i=0;i<queueSize;i++){
                TreeNode temp= queue.poll();


                if(isZigZag){
                    list.addFirst(temp.value);

                }else{
                    list.add(temp.value);
                }

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            isZigZag=!isZigZag;
            finalList.add(list);
        }

        return finalList;
    }
}
