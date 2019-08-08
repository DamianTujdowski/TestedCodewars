package Array;

import java.util.Arrays;

public class FindTheParityOutlier {
    public int outlier(int[] integers) {
        return Arrays.stream(integers)
                .filter(x -> x % 2 != 0)
                .count() == 1 ?
                Arrays.stream(integers)
                        .filter(x -> x % 2 != 0)
                        .findFirst()
                        .getAsInt() :
                Arrays.stream(integers)
                        .filter(x -> x % 2 == 0)
                        .findFirst()
                        .getAsInt();
    }
}
