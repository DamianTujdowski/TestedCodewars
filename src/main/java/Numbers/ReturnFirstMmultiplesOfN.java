package Numbers;

import java.util.stream.IntStream;

public class ReturnFirstMmultiplesOfN {
    public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1, m)
                .map(x -> x * n)
                .toArray();
    }
}
