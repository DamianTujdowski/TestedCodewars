package Strings;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StringRepeater {
    public static String repeat(String string, long n) {
//        StringBuilder builder = new StringBuilder();
//        for(long i = 0; i < n; i++){
//            builder.append(string);
//        }
        return LongStream
                .range(0, n)
                .mapToObj(x -> string)
                .collect(Collectors.joining());
    }
}
