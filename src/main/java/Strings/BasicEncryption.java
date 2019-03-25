package Strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicEncryption {

    public String encrypt(String text, int value) {
        return IntStream.range(0, text.length())
                .map(x -> text.charAt(x) + value)
                .mapToObj(x -> String.valueOf((char)(x % 256)))
                .collect(Collectors.joining());
    }
}
