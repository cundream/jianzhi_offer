package com.lc.offer;

public class Offer12 {


    /**
     * 题目：
     * ：输入一个正整数n，请计算位数为n的最大正数,
     * 并从1开始依次打印到这个最大的n位正数。
     *
     * @author
     */
    public static void main(String[] args) {
        int n = 3;
        Offer12 p = new Offer12();
        p.print(n);
    }

    public void print(int n) {
        char[] result = new char[n];
        printHelpRecursive(result, n, 0);
    }


    public void printHelpRecursive(char[] result, int length, int index) {
        if (index == length) {
            printNumber(result);
        } else {
            for (int i = 0; i <= 9; i++) {
                result[index] = (char) ('0' + i);
                printHelpRecursive(result, length, index + 1);
            }
        }
    }


    public void printNumber(char[] re) {
        int len = re.length;
        boolean canPrint = false;
        for (int i = 0; i < len - 1; i++) {
            if (!canPrint && re[i] != '0') {
                canPrint = true;
            }
            if (canPrint) {
                System.out.print(re[i]); //不换行输出
            }
        }
        System.out.println(re[len - 1]);
    }
}
