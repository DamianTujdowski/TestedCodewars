package codewars.com;

import java.util.stream.Stream;

public class CountTheDigit {

    public int digitOccurances2(int n, int digit) {
        return Stream.iterate(0, x -> x + 1)
                .limit(n + 1)
                .map(x -> String.valueOf(x * x))
                .map(x -> x.replaceAll("[^" + digit + "]", ""))
                .mapToInt(String::length)
                .sum();
    }
}
