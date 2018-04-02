package com.lc.offer;

public class Offer14 {


    /*
   * 题目  调整数组顺序是奇数位于偶数前面
   *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
   *使得所有的奇数位于偶数的前半部分，所有偶数位于数组的后半部分
   * */


    public static void reorderOddEven(int[] array) {
        if (array == null || array.length <= 0) {
            throw new RuntimeException("数组 无效");
        } else if (array.length == 1) {
            throw new RuntimeException("数组长度为1，无需排序！");
        }


        int begin = 0;
        int end = array.length - 1;
        while (begin < end) {

            //end从后向前扫描，若当前元素为偶数，则继续往前扫描，若为奇数，end停止扫描。
            System.out.println("--------------------");
            while (array[begin] % 2 == 1) {
                System.out.println("begin++"+begin);
                begin++;
            }

            while (array[end] % 2 == 0) {
                System.out.println("end--"+end);
                end--;
            }
            //当begin、end都停止时，如果begin和end还没有相遇，就交换这两个数
            if (begin < end) {
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }

        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        reorderOddEven(array);

        for(int a : array){
            System.out.print(a+",");
        }


    }
}
