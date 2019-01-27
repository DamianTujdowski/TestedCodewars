package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotatingString {
    public  boolean containAllRots(String strng, List<String> arr) {
        int counter = 0;
        String temp = strng;
        for (int i = 0; i < strng.length(); i++) {
            temp = temp.substring(1, strng.length()) + temp.charAt(0);
            for (String st : arr) {
                if (temp.equals(st)) {
                    counter++;
                    break;
                }
            }
        }
        if (counter != strng.length()) {
            return false;
        }
        return true;
    }

    public boolean rotateWithStream(String in, List<String> arr) {
        return arr.containsAll(rotationsList(in));
    }

    public List<String> rotationsList(String in){
        return IntStream.range(0, in.length())
                .mapToObj(x -> in.substring(x, in.length()).concat(in.substring(0, x)))
                .collect(Collectors.toList());
    }

    public boolean rotateWithStream2(String in, List<String> arr) {
        return rotationsList2(in).allMatch(arr::contains);
    }

    public Stream<String> rotationsList2(String in){
        return IntStream.range(0, in.length())
                .mapToObj(x -> in.substring(x, in.length()).concat(in.substring(0, x)));
    }
}
