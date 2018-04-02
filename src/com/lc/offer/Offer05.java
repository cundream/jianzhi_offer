package com.lc.offer;

import java.util.ArrayList;
import java.util.Stack;

public class Offer05 {


    /*
   * 题目  输入一个链表的头结点，从尾到头反过来打印出每个结点的值
   *
   * */


    /**
     * 通过使用栈结构，遍历链表，把先遍历的节点的值推入栈中，遍历结束后通过弹出栈内元素实现逆序打印
     *
     * @param node
     */
    public static void printListFromTailToHeadByStack(ListNode node) {
        Stack<Integer> stack = new Stack<Integer>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + ",");
        }

    }

    /**
     * 二：递归发逆顺序打印链表
     *
     * @param node
     */
    public static void printListFromTailToHead(ListNode node) {
        if (node != null) {
            if (node.next != null) {
                printListFromTailToHead(node.next);
            }
            System.out.println(node.val);
        } else {
            System.out.println("链表为空");
        }
    }

    /**
     * 三：使用ArrayList逆序打印链表
     *
     * @param node
     */
    public static void printListFromTailToHeadByArrayList(ListNode node) {

        if (node == null) {
            System.out.println("链表为空");
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (node != null) {
            arrayList.add(node.val);
            node = node.next;
        }
       /* arrayList.stream().forEach(i ->{  //添加进来的是正序
            System.out.println(i+",");
        });*/

        for (int i = arrayList.size() - 1; i >= 0; i--) {//把正序倒序打印
            System.out.println(arrayList.get(i) + ",");
        }

    }


    /*
       * 方案四：递归反转链表，后遍历打印
      */
    public static void printListFromTailToHeadByReverseList(ListNode node) {
        ListNode reversedNode = reverse(node);
        while (reversedNode != null) {
            System.out.print(reversedNode.val + ",");
            reversedNode = reversedNode.next;
        }

    }

    //递归反转
    private static ListNode reverse(ListNode head) {
        if (head.next == null)
            return head;
        ListNode reversedListNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListNode;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        public ListNode() {
        }

        public ListNode(int value) {
            this.val = value;
        }


    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = null;
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode();
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //printListFromTailToHeadByStack(node7);
       // printListFromTailToHead(node1);
       // printListFromTailToHeadByArrayList(node1);
        //printListFromTailToHeadByReverseList(node1);

    }
}
