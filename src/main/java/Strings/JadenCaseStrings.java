package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCaseStrings {
    public String toJadenCase(String phrase) {
        return phrase == null || phrase.length() == 0 ? null : Arrays.stream(phrase.split(" "))
                .map(x -> new StringBuilder(x).replace(0, 1, x.substring(0, 1).toUpperCase()).toString())
                .collect(Collectors.joining(" "));
    }
}
