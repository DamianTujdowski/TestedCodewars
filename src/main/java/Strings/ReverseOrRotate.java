package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseOrRotate {
    public static String revrot(String strng, int sz) {
        if (strng.length() == 0 || sz <= 0 || sz > strng.length()) {
            return "";
        }

        String[] chunks = IntStream.iterate(0, i -> i + sz)
                .limit(strng.length() / sz)
                .mapToObj(x -> strng.substring(x, x + sz))
                .toArray(String[]::new);

        return Arrays.stream(chunks)
                .map(x -> sumOfCubesIsDivisibleByTwo(x) ? reverse(x) : rotate(x))
                .collect(Collectors.joining());
    }

    private static boolean sumOfCubesIsDivisibleByTwo(String number) {
        return Arrays.stream(number.split(""))
                .mapToInt(Integer::valueOf)
                .map(x -> x * x)
                .sum() % 2 == 0;
    }

    private static String rotate(String number) {
        return number.substring(1).concat(number.substring(0, 1));
    }

    private static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
