package Array;

import java.util.Arrays;

public class SortTheOdd {
    public int[] oddNumbersSorter(int[] array) {
        int[] sortedOdd = Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();

        int counter = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
                array[i] = sortedOdd[counter];
            }
        }
        return array;
    }
}
