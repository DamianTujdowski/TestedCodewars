package Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HelpTheBookseller {
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return Arrays.stream(lstOf1stLetter)
                .map(x -> "(" + x + " : " + Arrays.stream(lstOfArt)
                        .filter(y -> y.substring(0, 1).equals(x))
                        .map(y -> y.substring(y.indexOf(" ") + 1))
                        .mapToInt(Integer::parseInt)
                        .sum() + ")")
                .collect(Collectors.joining(" - "));
    }
}
