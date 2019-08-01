package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SumOfParts {
//    public int[] sumOfParts2(int[] ls) {
//        return IntStream.iterate(ls.length, i -> i - 1)
//                .limit(ls.length + 1)
//                .map(x -> Arrays.stream(ls)
//                        .boxed()
//                        .sorted(Comparator.reverseOrder())
//                        .limit(x)
//                        .mapToInt(Integer::intValue)
//                        .sum())
//                .toArray();
//    }

    public int[] sumOfParts(int[] ls) {
        return IntStream.rangeClosed(0, ls.length)
                .map(x -> Arrays.stream(ls, x, ls.length)
                        .sum())
                .toArray();
    }
}
