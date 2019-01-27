package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MovesInSquaredStrings {

    public static String vertMirror(String in) {
        return Arrays.stream(in.split("\\n"))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining("\n"));
    }

    public static String horMirror(String in) {
        List<String> list = Arrays.asList(in.split("\\n"));
        Collections.reverse(list);
        return String.join("\n", list);
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }

    public static String rot(String in) {
        List<String> list = Arrays.stream(in.split("\\n"))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        Collections.reverse(list);
        return String.join("\n", list);
    }

    public static String selfieAndRot(String in) {
        List<String> list = Arrays.stream(in.split("\\n"))
                .map(x -> x + String.join("", Collections.nCopies(x.length(), ".")))
                .collect(Collectors.toList());
        List<String> list2 = list.stream()
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        Collections.reverse(list2);
        return Stream.concat(list.stream(), list2.stream())
                .collect(Collectors.joining("\n"));
    }

    public static String oper2(Function<String, String> operator, String in) {
        return operator.apply(in);
    }

    public static String diagonalSym(String in) {
        String[] array = in.split("\n");
        return IntStream.range(0, array[0].length())
                .mapToObj(x -> {
                    StringBuilder builder = new StringBuilder();
                    for (String s : array) {
                        builder.append(s.charAt(x));
                    }
                    return builder.toString();
                })
                .collect(Collectors.joining("\n"));
    }

    public static String rotation90(String in) {
        return Stream.of(diagonalSym(in).split("\n"))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining("\n"));
    }

    public static String selfieAndDiagonal(String in) {
        String[] regular = in.split("\n");
        String[] rotated = diagonalSym(in).split("\n");
        return IntStream.range(0, regular[0].length())
                .mapToObj(x -> regular[x] + "|" + rotated[x])
                .collect(Collectors.joining("\n"));
    }

}
