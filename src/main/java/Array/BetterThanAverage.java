package Array;

import java.util.Arrays;

public class BetterThanAverage {
    public boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = Arrays.stream(classPoints).sum();
        return yourPoints > (sum + yourPoints) / (classPoints.length + 1);
    }
}
