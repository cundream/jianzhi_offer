package com.lc.offer;

public class Offer04 {


    /*
   * 题目 替换字符串中的空格为%20
   *
   * */


    /**
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {

        if (str == null) {
            return null;
        }
        int fromIndex = 0;
        int index = 0;
        StringBuffer temp = new StringBuffer();
        int length = str.length();
        while (index <= length) {
            index = str.indexOf(" ", fromIndex);
            if (index >= 0) {
                temp.append(str.subSequence(fromIndex, index)).append("%20");
                index = index + 1;
                fromIndex = index;
            } else {
                temp.append(str.substring(fromIndex, length));
                break;
            }
        }
        return temp.toString();
    }


    /**
     * @param array1
     * @param array2
     * @return
     */
    public static int[] InsertSortedArrays(int[] array1, int array2) {
        return null;
    }


    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("12 34 56")));
        System.out.println(replaceSpace(new StringBuffer(" ")));
        System.out.println(replaceSpace(new StringBuffer("     ")));
        System.out.println(replaceSpace(new StringBuffer("weare ")));

    }
}
