package Strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayingWithPassphrazes {

    public static String playPass(String s, int n) {
        String temp = s.chars()
                .map(x -> transformLetter(x, n))
                .map(x -> transformDigit(x))
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining(""));

        String result = IntStream.range(0, temp.length())
                .map(x -> x % 2 != 0 ? transformCase(temp.charAt(x)) : temp.charAt(x))
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining(""));

        return new StringBuilder(result).reverse().toString();
    }

    private static int transformCase(int in) {
        if (in >= 'A' && in <= 'Z') {
            in += 32;
        }
        return in;
    }

    private static int transformLetter(int in, int shift) {
        if (in >= 'A' && in <= 'Z') {
            in = ((in - 'A' + shift) % 26 + 65);
        }
        return in;
    }

    private static int transformDigit(int in) {
        if (in >= '0' && in <= '9') {
            in = '9' - in + 48;
        }
        return in;
    }
}
