package 字符串的排列;

import java.util.*;

/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */

public class Solution {

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if(str==null || str.length()==0) {
            return ans;
        }
        char[] arr = str.toCharArray();
        permutation(arr, 0, ans);
        Collections.sort(ans);
        return ans;
    }

    private static void permutation(char[] arr, int i, ArrayList<String> ans) {
        if(i == arr.length-1){
            if(!ans.contains(String.valueOf(arr)))
                ans.add(String.valueOf(arr));
        }
        else{
            for(int j=i; j<arr.length; j++){
                swap(arr, i, j);
                permutation(arr, j+1, ans);
                swap(arr, i, j);
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        String line = "aaa";
        ArrayList<String> ans = Permutation(line);
        for(String str : ans)
            System.out.println(str);
    }
}
