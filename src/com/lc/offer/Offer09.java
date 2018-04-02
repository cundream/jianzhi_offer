package com.lc.offer;

public class Offer09 {


    /*
   * 题目 斐波那契数列
   * 题目：写一个函数，输入n，求斐波那契数列的第n项。
   *　　　　                            0,                n=0
   *     斐波那契数列定义如下：f(n)=      1,                n=1
   *                              　　 f(n-1)+f(n-2),    n>1
   *
   *
   *
   * */


    /**
     * 采用递归实现，效率低
     * @param n
     * @return
     */
    public static int generateFibonacci(int n){
        //健壮性判断
        if(n < 0){
            System.out.println("n不能小于0！");
            return 0;
        }

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return generateFibonacci(n-1) + generateFibonacci(n -2);

    }

    /**
     * 采用循环实现，存储数列中间项，求得结果
     * @param n
     * @return
     */
    public static int fibonacci(int n){

        //健壮性判断
        if(n < 0){
            System.out.println("n不能小于0");
            return 0;
        }



        if(n ==0 || n == 1){
            return  n;
        }
        //a1用于存储fibonacci(n-2)，a2用于存储fibonacci(n-1)，a3用于存储fibonacci(n)
        int a1=0,a2=1,a3=1;
        for(int i=0;i < n-1;i++){
            a3 = a1+a2;
            a1 = a2;
            a2 = a3;
        }

        return a3;

    }
    public static void main(String[] args) {

        System.out.println("第4项斐波那契数列的值为："+fibonacci(3));

    }
}
