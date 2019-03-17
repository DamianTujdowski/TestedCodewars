package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInSentence {
    public String reverse(String in) {
        if (Arrays.toString(in.split(" ")).length() == 2) {
            return in;
        }
        return Arrays.stream(in.split(" "))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
