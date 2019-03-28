package Strings;

import java.util.ArrayList;
import java.util.List;

public class MakeTheDeadfishSwim {
    public int[] parser(String data) {
        String[] input = data.split("[^idso]*");
        int temp = 0;
        List<Integer> result = new ArrayList<>();

        for (String letter : input) {
            switch (letter) {
                case "i":
                    temp++;
                    break;
                case "d":
                    temp--;
                    break;
                case "s":
                    temp *= temp;
                    break;
                case "o":
                    result.add(temp);
                    break;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
