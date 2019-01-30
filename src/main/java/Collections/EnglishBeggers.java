package Collections;


public class EnglishBeggers {
    public int[] almsCount(int[] values, int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < values.length; j += n) {
                result[i] += values[j];
            }
        }
        return result;
    }
}
