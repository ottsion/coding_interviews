package 旋转数组的最小数字;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

public class Solution {
    public static int minNumberInRotateArray(int[] array) {
        if(array.length == 0)
            return 0;
        if(array[0]<=array[array.length-1])
            return array[0];
        int midIndex;
        int starIndex = 0;
        int endIndex = array.length-1;
        while(starIndex<endIndex-1){
            System.out.println("startIndex:"+starIndex+" endIndex:"+endIndex);
            midIndex = starIndex + (endIndex - starIndex)/2;
            if(array[midIndex]>array[starIndex])
                starIndex = midIndex;
            else if(array[midIndex] <= array[endIndex])
                endIndex = midIndex;
        }
        System.out.println("-startIndex:"+starIndex+" endIndex:"+endIndex);
        return array[starIndex]<array[endIndex]?array[starIndex]:array[endIndex];
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
}
