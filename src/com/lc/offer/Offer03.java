package com.lc.offer;

public class Offer03 {


    /*
   * 题目 003
   *   在一个二维数组中，每一行都按照从左导游的递增的顺序排序，
   *   每一列都按照从上到下递增的顺序排序。完成一个函数，输入这样一个二维数组和
   *   一个整数，判断数组是否含有该整数
   * */

    /**
     *
     * @param array  //二维数组
     * @param number   //查找的数字
     * @return
     */
    public static  boolean findByTheUpperRightCorner(int[][] array,int number){

        boolean found = false;
        if(array.length > 0){
            int rows = array.length;
            int columns = array[0].length;
            int row = 0;
            int column = columns - 1;
            while(row < rows && column >=0){
                int num = array[row][column];
                System.out.println(num);
                if (num == number){
                    found = true;
                    break;
                }else if(num > number){
                    column--;
                }else{
                    row++;
                }


            }
        }
        return found;

    }

    public static void main(String[] args) {
        int[][] test = {{1,2,8,9},
                        {2,4,9,12},
                        {4,7,10,12},
                        {6,8,11,15}};
        System.out.println(findByTheUpperRightCorner(test,7));

    }
}
