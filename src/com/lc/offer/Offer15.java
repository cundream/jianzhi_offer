package com.lc.offer;

public class Offer15 {


    /*
   * 题目  输入一个链表，输出该链表的倒数第K个节点。
   * 为了符合大多数人的习惯，本题从1开始计数，即链表尾节点是倒数第一个节点。
   *
   * 解法一：一般情况下，单向链表无法从后一个节点获取到它前面的节点，
   * 可以通过两次遍历，第一次遍历获取链表中节点的个数，第二次遍历找到链表中第n-k+1个节点，
   * 就是链表的倒数第k个节点。但是这种方法效率低，可以使用一次遍历得到倒数第K个节点
   * 解法二：一次遍历得到倒数第K个节点。维护两个指针，第一个指针从链表头结点向前走k-1步，
   * 第二个节点指向头结点，从第K步开始，如果走在前面的节点有下一个节点，那两个节点一起向前走，
   * 直到第一个节点走到尾节点，此时第二个节点指向倒数第K个节点
   * */


    public static class ListNode {


        public int data;
        public ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;

        }
    }

    public static ListNode findKthNodeFromEnd(ListNode head, int k) {

        if (head == null) {
            throw new RuntimeException("待查链表不能为空");
        } else if (k < 0) {
            throw new RuntimeException("输入的查询数字不合法");
        }
        ListNode behind = head;

        //第一个指针指向K -1 ,并检验连别中节点个数是否大于k
        int count = 1;
        for (int i = 0; i < k - 1; i++) {
            if(head.next != null){
                head = head.next;
                count++;
            }else{
                throw new RuntimeException("链表的个数："+count+"小于输入的K="+k+"的个数");
            }
        }

        while(head.next != null){
            head = head.next;
            behind = behind.next;
        }

        return behind;

    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(1,null);
        ListNode tail1 = new ListNode(2,tail);
        ListNode tail2 = new ListNode(3,tail1);
        ListNode head = new ListNode(4,tail2);

        System.out.println("-----------------------");

        ListNode find = findKthNodeFromEnd(head,3);
        System.out.println(find.data);


    }
}
