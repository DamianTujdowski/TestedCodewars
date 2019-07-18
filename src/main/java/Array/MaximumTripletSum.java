package Array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumTripletSum {
    public int maximumTripletFinder(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .mapToInt(x -> x)
                .sum();
    }
}
