package 顺时针打印矩阵;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1  2   3   4
 * 5  6   7   8
 * 9  10  11  12
 * 13 14  15  16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 0 0
 * 0 1
 * 0 2
 * 0 3
 * 1 3
 * 2 3
 * 3 3
 * 3 2
 * 3 1
 * 3 0
 * 2 0
 * 1 0
 * 1 1
 *
 */


public class Solution {

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix.length==0)
            return null;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        rebuild(matrix, ans, 0);
        return ans;
    }

    private static void rebuild(int[][] matrix, ArrayList<Integer> ans, int col) {
        int i=col, j=col;
        if((col+1) * 2 -1 == matrix.length) {
            for (; j < matrix[0].length - col; j++)
                ans.add(matrix[i][j]);
        }
        else if((col+1) * 2 -1 == matrix[0].length){
            for (; i < matrix.length - col; i++)
                ans.add(matrix[i][j]);
        }
        else {
            for (; j < matrix[0].length - col; j++)
                ans.add(matrix[i][j]);
            j--;
            for (i=i+1; i < matrix.length - col; i++)
                ans.add(matrix[i][j]);
            i--;
            for (j=j-1; j > col; j--)
                ans.add(matrix[i][j]);

            for (; i > col; i--)
                ans.add(matrix[i][j]);
            if(matrix.length > (col+1) * 2  && matrix[0].length > (col+1) * 2)
                rebuild(matrix, ans, col+1);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1},{2},{3},{4}};
        ArrayList<Integer> ans = printMatrix(matrix);
        for(int data: ans)
            System.out.print(data+" ");
        System.out.println();
    }
}
