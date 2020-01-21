package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Solution {

    public String PrintMinNumber(int [] numbers) {

        ArrayList<String> temp = new ArrayList<>();
        for(int num: numbers)
            temp.add(String.valueOf(num));
        Collections.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1+o2;
                String b = o2+o1;
                return a.compareTo(b);
            }
        });
        StringBuffer sb = new StringBuffer();
        for(String line: temp)
            sb.append(line);
        return sb.toString();
    }
}
