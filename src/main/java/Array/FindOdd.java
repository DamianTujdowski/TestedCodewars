package Array;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindOdd {
    public int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(groupingBy(Integer::intValue, counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
