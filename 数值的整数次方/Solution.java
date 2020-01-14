package 数值的整数次方;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Solution {
    public static double Power(double base, int exponent) {

        double ans = 1;
        boolean flag = exponent>0;
        exponent = Math.abs(exponent);
        while(exponent>0){
            ans = ans * base;
            exponent--;
        }
        return flag==true?ans:1.0/ans;
    }

    public static void main(String[] args) {
        System.out.println(Power(2, -3));
    }
}
