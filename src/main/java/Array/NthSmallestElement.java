package Array;

import java.util.Arrays;
import java.util.Comparator;

public class NthSmallestElement {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr)
                .sorted()
                .limit(n)
                .boxed()
                .max(Comparator.naturalOrder())
                .get();
    }
}
