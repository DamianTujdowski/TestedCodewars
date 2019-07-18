package Array;

import java.util.stream.IntStream;

public class ReverseArray {
    public static String[] reverser(String[] in) {
        String temp = String.join("", in);
        return IntStream.range(0, in.length - 1)
                .mapToObj(x -> in[x] = temp.substring(x, in[x].length() - 1))
//                .mapToObj(x -> in[in.length - x])
                .toArray(String[]::new);
    }
}
