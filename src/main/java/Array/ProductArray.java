package Array;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ProductArray {
    public long[] productArray(int[] numbers) {
        return LongStream.range(0, numbers.length)
                .map(x -> Arrays.stream(numbers)
                        .filter(y -> y != numbers[(int) x])
                        .mapToLong(z -> z)
                        .reduce((a, b) -> a * b)
                        .getAsLong())
                .toArray();
    }

    public int arrayProducter(int[] in, int place) {
        return Arrays.stream(in)
                .filter(y -> y != in[place])
                .reduce((a, b) -> a * b)
                .getAsInt();
    }
}
