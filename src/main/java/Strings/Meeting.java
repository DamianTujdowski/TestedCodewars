package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Meeting {
    public String listSorter(String s) {
       return Arrays.stream(s.split(";"))
                .map(Meeting::formatter)
                .sorted()
                .collect(Collectors.joining());
    }

    private static String formatter(String in) {
        return String.format("(%s, %s)", in.substring(in.indexOf(":") + 1), in.substring(0, in.indexOf(":"))).toUpperCase();
    }
}
