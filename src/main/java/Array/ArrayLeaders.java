package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeaders {
    public List leaders(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(x -> numbers[x] > Arrays.stream(numbers, x + 1, numbers.length).sum() ? numbers[x] : Integer.MIN_VALUE)
                .filter(x -> x != Integer.MIN_VALUE)
                .boxed()
                .collect(Collectors.toList());
    }
}
