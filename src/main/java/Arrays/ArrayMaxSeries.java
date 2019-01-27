package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMaxSeries {
    public long maxProduct(int[] numbers, int subSize) {
        Arrays.sort(numbers);
        return IntStream.range(numbers.length - subSize, numbers.length)
                .mapToLong(x -> numbers[x])
                .reduce(1, (x, y) -> x * y);
    }
}
