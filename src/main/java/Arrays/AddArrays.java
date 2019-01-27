package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] temp = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, temp, first.length, second.length);

        return IntStream.range(0, temp.length)
                .map(x -> x = temp[x])
                .distinct()
                .sorted()
                .toArray();
    }

    public static int summation(int n) {
        return IntStream.iterate(1, x -> x + 1)
                .limit(n)
                .sum();
    }

    public static void main(String[] args) {
        int[] one = {2, 4, 6};
        int[] two = {2, 5, 7};

        System.out.println(summation(1));
    }
}
