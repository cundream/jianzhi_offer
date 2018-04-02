package com.lc.offer;

public class Offer13 {


    /*
   * 题目  在O(1)时间删除链表节点
   * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点
   *
   * */


    public static class ListNode{

        public int data;
        public ListNode next;

        public ListNode(int data,ListNode next){
            this.data = data;
            this.next = next;

        }
    }

    public static void deleteNode(ListNode head,ListNode node){
        //删除尾节点，采用顺序查找找到尾节点的前一个节点
        if(node.next == null){
            while(head.next != node){
                System.out.println("--1-");
                head = head.next;
            }

            System.out.println("-2-");
            head.next = null;
        }
        //要删除的节点是头结点
        else if(head == node){
            System.out.println("---33");
            head = null;
        }
        //删除的节点是中间的普通节点
        else{
            node.data = node.next.data;
            node.next = node.next.next;
            System.out.println("--4-");
        }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(1,null);
        ListNode tail1 = new ListNode(2,tail);
        ListNode tail2 = new ListNode(3,tail1);
        ListNode head = new ListNode(4,tail2);

        System.out.println("-----------------------");
        deleteNode(head,tail1);

        while(head != null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}
