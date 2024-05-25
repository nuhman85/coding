package com.nuhman.coding.problem;

import java.sql.SQLOutput;

public class ListSum {

    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.


    public static ListNode findSum(ListNode l1, ListNode l2){
        int sum = 0;

        ListNode resNode = new ListNode();
        ListNode copyNode  = resNode;

        while(l1!=null || l2!=null || sum!=0){
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum +=l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = sum%10;
            copyNode.next  = newNode;
            copyNode = newNode;

            sum/=10;

        }

        return resNode.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        ListNode c1 = new ListNode(4);
        ListNode c2 = new ListNode(6);
        l1.next = c1;
        l2.next = c2;

        c1 = new ListNode(3);
        c2 = new ListNode(4);

        l1.next.next = c1;
        l2.next.next = c2;

ListNode listNode= findSum(l1, l2);

        System.out.println(listNode);
    }
}
