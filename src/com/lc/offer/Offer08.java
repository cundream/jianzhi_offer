package com.lc.offer;

public class Offer08 {


    /*
   * 题目
   * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
   * 输入一个递增排序数组的一个旋转，输出旋转数组的最小元素。
   * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
   * 解题思路： 在排序数组中，可以使用二分查找法进行查找
   *
   * */


    public static int findMin(int[] array) {
        if (array == null || array.length <= 0) {
            throw new RuntimeException("无效 数组");
        }
        int indexLow = 0;
        int indexHigh = array.length - 1;
        int indexMiddle = indexLow;
        while (array[indexLow] >= array[indexHigh]) {
            if (indexHigh - indexLow == 1) {
                indexMiddle = indexHigh;
                break;
            }
            indexMiddle = (indexLow + indexHigh) / 2;
            if (array[indexMiddle] == array[indexLow] && array[indexHigh] == array[indexLow]) {
                return findMinInOrder(array, indexLow, indexHigh);
            } else if (array[indexMiddle] >= array[indexLow]) {
                indexLow = indexMiddle;
            } else {
                indexHigh = indexMiddle;
            }

        }

        return array[indexMiddle];

    }

    public static int findMinInOrder(int[] array, int indexLow, int indexHigh) {
        int result = array[indexLow];
        for (int i = indexLow + 1; i < indexHigh; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println("升序排序数组的一个旋转数组，无重复数字：" + findMin(array1));
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("升序排序数组：" + findMin(array2));
        int[] array3 = {1};
        System.out.println("只包含一个数字的数组：" + findMin(array3));
        int[] array4 = {2, 4, 2, 2, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + findMin(array4));
        int[] array5 = null;
        System.out.println("null数组：" + findMin(array5));

    }
}
