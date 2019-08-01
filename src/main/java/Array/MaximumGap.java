package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumGap {
    public int maximumGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.iterate(numbers.length - 1, i -> i - 1)
                .limit(numbers.length - 1)
                .map(x -> Math.abs(numbers[x] - numbers[x - 1]))
                .max()
                .getAsInt();
    }
}
