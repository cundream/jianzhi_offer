package com.lc.offer;

public class Offer16 {


    /*
   * 题目  定义一个函数，输入一个链表的头结点，反转该链表并输出反转后的链表的头结点。
   *
   * */

    public static class ListNode {


        public int data;
        public ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;

        }
    }

    public static ListNode reverseList(ListNode head){
        if (head == null) {
            throw new RuntimeException("待查链表不能为空");
        } else if (head.next == null) {
            return head;
        }
        ListNode reversedHead = null;
        ListNode node = head;
        ListNode preNode = null;
        while (node != null){
            ListNode nextNode = node.next;
            if(nextNode == null){
                reversedHead = node;
            }
            node.next = preNode;
            preNode = node;
            node = nextNode;
        }
        return  reversedHead;


    }

    public static void print(ListNode head){
        if(head == null){
            System.out.println("链表为空");
        }else{
            while (head != null){
                System.out.println(head.data+",");
                head =head.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(1,null);
        ListNode tail1 = new ListNode(2,tail);
        ListNode tail2 = new ListNode(3,tail1);
        ListNode head = new ListNode(4,tail2);
        print(head);
        System.out.println("--");
        print(reverseList(head));
    }
}
