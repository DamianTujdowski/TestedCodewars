package Array;

public class MaximumProduct {
    public int maximumProductFinder(int[] array) {
        int result = Integer.MIN_VALUE, temp;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i] * array[i + 1];
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
