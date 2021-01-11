package com.interview.coding.dataStruture.linkedList;

import java.util.Scanner;

public class mergeKSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter list size:");
        int input=sc.nextInt();
        ListNode[] lists=new ListNode[input];
        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<input;i++)
        {
            System.out.println("Enter number of elements required:");
            int numberOfElements=sc.nextInt();
            for(int j=0;j<numberOfElements;j++)
            {
                ListNode curr=new ListNode();
                System.out.println("Enter element:");
                curr.val=sc.nextInt();
                if(head==null)
                {
                    head=curr;
                    tail=curr;
                }
                else
                {
                    tail.next=curr;
                    tail=curr;
                }

            }
            lists[i]=head;
        }
       /* for (int i=0;i<input;i++)
        {
            while(lists[i]!=null)
            {
                System.out.println(lists[i].val);
                lists[i]=lists[i].next;
            }
        }*/

        ListNode finalRes=mergeKLists(lists);
        while (finalRes!=null)
        {
            System.out.print(finalRes.val+"-->");
            finalRes=finalRes.next;
        }

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode res=lists[0];
        if(lists.length==1)
        {
            return res;
        }
        for(int i=1;i< lists.length;i++)
        {
            while(lists[i]!=null)
            {
                if(res.val<lists[i].val)
                {
                    res=res.next;
                    lists[i]=lists[i].next;
                }
                else if(res.val>lists[i].val)
                {
                    ListNode temp=lists[i];
                    lists[i].next=res;
                    res=lists[i].next;
                    lists[i]=lists[i].next;
                }
            }
        }

      return res;
    }
}
