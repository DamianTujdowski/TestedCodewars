package Array;

import java.util.Arrays;

public class MinimumSumOfArray {
    public int minimumSum(int[] passed) {
        int sum = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - i - 1];
        }
        return sum;
    }
}
