package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
    public int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .map(String::length)
                .min(Comparator.comparingInt(x2 -> x2))
                .orElse(0);
    }
}
