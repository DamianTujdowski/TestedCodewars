package Numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FormTheLargestNumber {
    public int maxNumber(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n).split(""))
                .sorted((x1, x2) -> Integer.valueOf(x2) - Integer.valueOf(x1))
                .collect(Collectors.joining()));
    }
}
