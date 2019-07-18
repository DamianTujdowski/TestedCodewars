package Numbers;

import java.util.Arrays;

public class FormTheMinimum {
    public int formMinimalNumber(int[] values) {
        return Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(String::valueOf)
                .reduce(String::concat)
                .map(Integer::valueOf)
                .get();
    }
}
