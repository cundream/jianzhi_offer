package com.lc.offer;

public class Offer11 {


    /*
   * 题目  实现base的exponent次方
   *
   * */


    public static double power(double base, int exponent) {
        if (equal(base, 0.0) && exponent < 0) {
            throw new RuntimeException("while exponent is minus,the base can't be zero");
        }

        int absExponent = exponent;
        if (exponent < 0) {
            absExponent = ~exponent + 1; //整数按位取反+1得到他的相反数
        }

        double result = powerWithUnsignedExponent(base,absExponent);

        if(exponent < 0){
            result = 1.0 /result;
        }
        return result;

    }


    /**
     *
     * @param base
     * @param absExponent
     * @return
     */
    private static double powerWithUnsignedExponent(double base, int absExponent) {
        double result = 1.0;
        for (int i = 1; i <= absExponent; i++) {
            result = result * base;
        }
        return result;
    }

    private static boolean equal(double number, double number2) {
        return number - number2 > -0.000000001 && number - number2 < 0.000000001;

    }

    public static void main(String[] args) {

        System.out.println(power(0.2,2));

    }
}
