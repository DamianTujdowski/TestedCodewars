package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparingArrays {
    public boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }

        List<Integer> list = Arrays.stream(a)
                .map(x -> x * x)
                .boxed()
                .collect(Collectors.toList());

        int aSum = list.stream().mapToInt(Integer::intValue).sum();
        int bSum = Arrays.stream(b).sum();

        return aSum == bSum && Arrays.stream(b)
                .boxed()
                .allMatch(list::contains);
    }
}
