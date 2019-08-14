package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConseciutiveStrings {
    public String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k <= 0 || k > strarr.length) {
            return "";
        }
        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(x -> Arrays.stream(strarr, x, x + k)
                        .collect(Collectors.joining())
                )
                .max(Comparator.comparingInt(String::length))
                .get();
    }
}
