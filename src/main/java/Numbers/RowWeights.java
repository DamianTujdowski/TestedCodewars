package Numbers;

public class RowWeights {

    public int[] rowWeigth(int[] weights) {
        int sumOne = 0, sumTwo = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                sumOne += weights[i];
            } else {
                sumTwo += weights[i];
            }
        }
        return new int[]{sumOne, sumTwo};
    }
}
