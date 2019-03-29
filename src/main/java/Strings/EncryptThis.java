package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptThis {
    public String encryptThis(String text) {
        return Arrays.stream(text.split(" "))
                .map(this::encrypter)
                .collect(Collectors.joining(" "));
    }

    private String encrypter(String in) {
        return in.length() == 0 ? in : in.length() == 1
                ? (int) in.charAt(0) + "" : in.length() == 2
                ? (int) in.charAt(0) + "" + in.charAt(1) :
                new StringBuilder()
                        .append((int) in.charAt(0))
                        .append(in.charAt(in.length() - 1))
                        .append(in, 2, in.length() - 1)
                        .append(in.charAt(1)).toString();
    }
}
