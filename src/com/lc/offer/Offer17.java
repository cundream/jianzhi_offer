package com.lc.offer;

public class Offer17 {


    /*
   * 题目 输入两个递增排序的链表，合并这两个链表并使新链表中的节点人是按照递增排序的
   *解题思路：两个链表分别都已经是有序的了，遍历链表的时候只要比较两个链表当前位置大小，取出最小的添加到新链表中。
   * */

    public static class ListNode {


        public int data;
        public ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;

        }
    }

    public static void print(ListNode head) {
        if (head == null) {
            System.out.println("链表为空");
        } else {
            while (head != null) {
                System.out.println(head.data + ",");
                head = head.next;
            }
        }
    }


    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        ListNode mergedHead = null;
        if (head1.data < head2.data) {
            mergedHead = head1;
            mergedHead.next = merge(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = merge(head1.next, head2);
        }
        return mergedHead;
    }


    //依次比较两个链表的当前结点，添加到新链表中
    public static ListNode mergeSortedList(ListNode head1, ListNode head2) {
        if (head1 == null)
            return head2;
        if (head2 == null) {
            return head1;
        }
        ListNode newHead = null;
        ListNode newNode = null;
        ListNode list1 = head1;
        ListNode list2 = head2;
        // 找到新的头结点
        if (list1.data < list2.data) {
            newHead = list1;
            list1 = list1.next;
        } else {
            newHead = list2;
            list2 = list2.next;
        }
        newNode = newHead;
        // 合并其他节点
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                newNode.next = list1;
                list1 = list1.next;
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }
            newNode = newNode.next;
        }
        // 有一条链表合并完，则把剩下的另一条链表直接合并到新链条末尾
        if (list1 == null) {
            newNode.next = list2;
        } else {
            newNode.next = list1;
        }
        return newHead;
    }


    public static void main(String[] args) {
        ListNode tail = new ListNode(7, null);
        ListNode tail1 = new ListNode(5, tail);
        ListNode tail2 = new ListNode(3, tail1);
        ListNode head = new ListNode(1, tail2);

        ListNode tail5 = new ListNode(8, null);
        ListNode tail6 = new ListNode(6, tail5);
        ListNode tail7 = new ListNode(4, tail6);
        ListNode head2 = new ListNode(2, tail7);

        print(mergeSortedList(head, head2));

    }
}
