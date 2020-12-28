package com.interview.coding.dataStruture.bfs;

import java.util.*;

public class bfsZigZag {

    public static class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> l = new Stack<>();
        Stack<TreeNode> r = new Stack<>();
        if (Objects.isNull(root)) {
            return result;
        }
        r.add(root);
        while (!l.isEmpty() || !r.isEmpty()) {
            int size = l.isEmpty() ? r.size() : l.size();
            List<Integer> list = new ArrayList<>();
            if (!l.isEmpty()) {
                for (int z = 0; z < size; z++) {
                    TreeNode tmp = l.pop();
                    list.add(tmp.val);
                    if (!Objects.isNull(tmp.right)) {
                        r.push(tmp.right);
                    }
                    if (!Objects.isNull(tmp.left)) {
                        r.push(tmp.left);
                    }
                }
            } else {
                for (int z = 0; z < size; z++) {
                    TreeNode tmp = r.pop();
                    list.add(tmp.val);
                    if (!Objects.isNull(tmp.left)) {
                        l.push(tmp.left);
                    }


                    if (!Objects.isNull(tmp.right)) {
                        l.push(tmp.right);
                    }
                }
            }
            result.add(list);
        }
        return result;
    }

}



