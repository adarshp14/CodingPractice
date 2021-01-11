package com.interview.coding.dataStruture.genericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class treeStructure {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int size(Node root) {
        int size = 0;
        for (Node n : root.children) {
            int childSize = size(n);
            size += childSize;
        }
        size = size + 1;
        return size;
    }

    public static void display(Node root) {
        String str = root.data + "->";
        for (Node child : root.children) {
            str += child.data + " ,";
        }
        str += " ";
        System.out.println(str);
        for (Node n : root.children) {
            display(n);
        }
        System.out.println(size(root));
    }

    public static int maxNode(Node root) {
        int max = Integer.MIN_VALUE;
        for (Node n : root.children) {
            int childMax = maxNode(n);
            max = Math.max(childMax, max);
        }
        return Math.max(max, root.data);

    }

    public static int heightOfNode(Node root) {
        int height = 0;
        for (Node n : root.children) {
            int temp= heightOfNode(n);
            height=Math.max(temp,height);
        }

        return height + 1;
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> temp = new ArrayDeque<>();
        temp.add(root);
        while (!temp.isEmpty()) {
            Node n = temp.remove();
            System.out.print(n.data + " ");
            for (Node t : n.children) {
                temp.add(t);
            }
        }
    }

    public static void levelOrderTraversalLineWise(Node root) {
        Queue<Node> mainQueue = new ArrayDeque<>();
        mainQueue.add(root);
        Queue<Node> childQueue = new ArrayDeque<>();
        while (mainQueue.size() > 0) {
            Node temp = mainQueue.remove();
            System.out.print(temp.data + " ");
            for (Node n : temp.children) {
                childQueue.add(n);
            }
            if (mainQueue.size() == 0) {
                mainQueue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();
            }


        }

    }

    public static void printZigZagNodes(Node root)
    {
       Stack<Node> mainStack=new Stack<>();
       mainStack.add(root);
       Stack<Node> childStack=new Stack<>();
        while (mainStack.size()>0)
        {
            Node temp=mainStack.pop();
            System.out.print(temp.data+" ");
            for (Node n:temp.children)
            {
                childStack.push(n);
            }
            if (mainStack.isEmpty())
            {
                mainStack=childStack;
                childStack=new Stack<>();
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = {1,-1,3,2,4,-1,5,6};
        Stack<Node> st = new Stack<>();
        for (int j : arr) {
            if (j == -1) {
                st.pop();
            } else {
                Node temp = new Node();
                temp.data = j;
                if (st.size() > 0)
                    st.peek().children.add(temp);
                else root = temp;
                st.push(temp);
            }

        }
        //display(root);
        int n = size(root);
        //System.out.println(n);
        int max = maxNode(root);
        //System.out.println(max);
        int height = heightOfNode(root);
        System.out.println(height);
        //levelOrderTraversal(root);
        //System.out.println();
        //levelOrderTraversalLineWise(root);
        //printZigZagNodes(root);
    }
}
