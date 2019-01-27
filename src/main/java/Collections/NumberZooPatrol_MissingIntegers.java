package Collections;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class NumberZooPatrol_MissingIntegers {

    public int findMissingNumber2(int[] in) {
        Arrays.sort(in);
        for (int i = 0; i < in.length; i++) {
            if (in[i] != i + 1) {
                return i + 1;
            }
        }
        return in.length + 1;
    }

    public int findMissingNumberStream(int[] numbers) {
        int actualSum = Stream.of(numbers)
                .flatMapToInt(Arrays::stream)
                .sum();

        int totalSum = (numbers.length + 1) * (numbers.length + 2) / 2;

        return totalSum - actualSum;
    }

    public int findMissingNumber(int[] numbers) {
        int sum = (numbers.length + 1) * (numbers.length + 2) / 2;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    public int findMissingNumberLong(int[] numbers) {
        long actualSum = Stream.of(numbers)
                .flatMapToInt(Arrays::stream)
                .mapToLong(x -> x)
                .sum();

        long totalSum = (numbers.length + 1) * (numbers.length + 2) / 2;

        return (int) (totalSum - actualSum);
    }

    public int findMissingNumberBig(int[] numbers) {
        BigInteger sum = new BigInteger(String.valueOf((numbers.length + 1) * (numbers.length + 2) / 2));

        for (int i : numbers) {
            sum = sum.subtract(new BigInteger(String.valueOf(i)));
        }
        return sum.intValue();
    }
}
