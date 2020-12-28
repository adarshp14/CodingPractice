package com.interview.coding.dataStruture.linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class linkedImplementation {
    static class Node {
    public int data;
    public Node next;

    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}

    public static class SinglyLinkedList {
        private Node head;

        public boolean isEmpty() {
            return (head == null);
        }

        // used to insert a node at the start of linked list
        public void insertFirst(int data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }

        // used to delete node from start of linked list
        public Node deleteFirst() {
            Node temp = head;
            head = head.next;
            return temp;
        }

        // Use to delete node after particular node
        public void deleteAfter(Node after) {
            Node temp = head;
            while (temp.next != null && temp.data != after.data) {
                temp = temp.next;
            }
            if (temp.next != null)
                temp.next = temp.next.next;
        }

        // used to insert a node at the start of linked list
        public void insertLast(int data) {
            Node current = head;
            while (current.next != null) {
                current = current.next; // we'll loop until current.next is null
            }
            Node newNode = new Node();
            newNode.data = data;
            current.next = newNode;
        }

        // For printing Linked List
        public void printLinkedList() {
            System.out.println("Printing LinkedList (head --> last) ");
            Node current = head;
            while (current != null) {
                current.displayNodeData();
                current = current.next;
            }
            System.out.println();
        }
    }
    public Node addTwoNumbers(Node l1,Node l2) {

        ArrayList<Integer> firstList=new ArrayList<>();
        ArrayList<Integer> secondList=new ArrayList<>();
        while(l1.next!=null)
        {
            firstList.add(l1.data);
            l1=l1.next;

        }
        while(l2.next!=null)
        {
            secondList.add(l2.data);
            l2=l2.next;
        }
        Collections.reverse(firstList);
        Collections.reverse(secondList);
        int extractInt1=0;
        int extractInt2=0;
        for(int i=0;i<firstList.size();i++)
        {
            extractInt1+=firstList.get(i)*(Math.pow(10,firstList.size()-1-i));
        }
        for(int i=0;i<secondList.size();i++)
        {
            extractInt2+=secondList.get(i)*(Math.pow(10,secondList.size()-1-i));
        }
        int result=extractInt1+extractInt2;


        return null;

    }

}
