package Arrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartOfList {
    public String[][] pairList(String[] arr) {
        String[][] result = new String[arr.length - 1][2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = j == 0 ? substringBegin(arr, i) : substringEnd(arr, i);
            }
        }
        return result;
    }

    private String substringBegin(String[] in, int end) {
        return IntStream.rangeClosed(0, end)
                .mapToObj(x -> in[x])
                .collect(Collectors.joining(" "));
    }

    private String substringEnd(String[] in, int end) {
        return IntStream.rangeClosed(end + 1, in.length - 1)
                .mapToObj(x -> in[x])
                .collect(Collectors.joining(" "));
    }
}
