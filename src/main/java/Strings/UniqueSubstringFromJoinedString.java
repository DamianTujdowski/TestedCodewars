package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSubstringFromJoinedString {
    public String concatenater(String one, String two) {

        List<String> oneLetters = Arrays.asList(one.split(""));
        String[] commonLetters = Arrays.stream(two.split(""))
                .filter(oneLetters::contains)
                .toArray(String[]::new);


        return String.join("", commonLetters);
    }
}
