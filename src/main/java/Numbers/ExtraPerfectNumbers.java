package Numbers;

import java.util.stream.IntStream;

public class ExtraPerfectNumbers {
    public int[] perfectNumbersChecker(int number) {
        return IntStream.rangeClosed(1, number)
                .filter(x -> Integer.toBinaryString(x).matches("^1.*1$|1"))
                .toArray();
    }
}
