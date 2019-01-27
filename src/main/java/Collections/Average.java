package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Average {
    public Double average(List<Integer> list) {
        return list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    public List<String> toUpperC(ArrayList<String> in) {
        return in.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public Integer maxValue(Integer[] list) {
        return Stream.of(list)
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }

    public List<String> filterWords(List<String> list) {
        return list.stream()
                .filter(x -> x.length() == 3)
                .filter(x -> x.charAt(0) == 97)
                .collect(Collectors.toList());
    }

    public String createString(List<Integer> list) {
        return list.stream()
                .map(x -> x % 2 == 0 ? "e" + x : "o" + x)
                .collect(Collectors.joining(","));
    }

    public String findPalindrome(String in) {
        return Stream.of(in.split(" "))
                .filter(Average::isPalindrome)
                .max(Comparator.comparingInt(String::length))
                .get();
    }

    public static boolean isPalindrome(String in) {
        for (int i = 0; i < in.length() / 2; i++) {
            if (in.charAt(i) != in.charAt(in.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public String partitionAdults(List<Person> list){
        return list.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ","Names: ", "."));
    }
}
