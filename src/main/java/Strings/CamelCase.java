package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {
    public String camelCase(String str) {
        return str == null || str.length() == 0 ? str : Arrays.stream(str.trim().split(" +"))
                .map(x -> String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1))
                .collect(Collectors.joining());
    }
}
