package Collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(String::intern, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .count();
    }
}
