package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class StringsInArrayLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        Arrays.sort(a1, Comparator.comparingInt(String::length));
        Arrays.sort(a2, Comparator.comparingInt(String::length));
        int length1 = Math.abs(a1[0].length() - a2[a2.length - 1].length());
        int length2 = Math.abs(a1[a1.length - 1].length() - a2[0].length());
        return length1 > length2 ? length1 : length2;
    }
}
