package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateEncoder {

    public String encoder(String word) {
        return Arrays.stream(word.toLowerCase().split(""))
                .map(x -> checker(word, x))
                .collect(Collectors.joining());
    }

    private String checker(String word, String c) {
        return Arrays.stream(word.toLowerCase().split(""))
                .filter(x -> x.equals(c))
                .count() > 1 ? ")" : "(";
    }
}
