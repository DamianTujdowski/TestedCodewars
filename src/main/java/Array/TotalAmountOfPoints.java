package Array;

import java.util.Arrays;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(x -> Integer.valueOf(x.substring(0, 1)) > Integer.valueOf(x.substring(2)) ?
                        3 : Integer.valueOf(x.substring(0, 1)) < Integer.valueOf(x.substring(2)) ? 0 : 1)
                .sum();
    }
}
