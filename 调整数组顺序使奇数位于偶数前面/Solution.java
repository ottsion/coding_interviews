package 调整数组顺序使奇数位于偶数前面;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Solution {

    public static void reOrderArray(int[] array) {
        int i=0;
        int j=1;
        while(i<array.length){
            if(array[i] % 2 == 1)
                i++;
            else{
                if(j<i)
                    j = i+1;
                if(j>array.length-1)
                    return;
                while(array[j] % 2 == 0){
                    j++;
                    if(j>=array.length)
                        return;
                }
                swap(array, i, j);
            }
            System.out.println("---------"+i+" "+j);
            for(int ii: array)
                System.out.print(ii+" ");
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        for(int k=j; k>i; k--){
            array[k] = array[k-1];
        }
        array[i] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2,1};
        reOrderArray(array);
        System.out.println();
        for(int i: array)
            System.out.print(i+" ");
    }

}
