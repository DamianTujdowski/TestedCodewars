package Strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ErrorsHistogram {
    public String histogramPrinter(String s) {
        int uNum = charNum(s, 'u'), wNum = charNum(s, 'w'), xNum = charNum(s, 'x'), zNum = charNum(s, 'z');

        String result = "";
        if (s.replaceAll("[^uwxz]", "").length() == 0) {
            return "";
        }
        if (uNum > 0) {
            result += verseMaker('u', uNum);
        }
        if (wNum + xNum + zNum == 0) {
            return result.substring(0, result.length() - 1);
        }
        if (wNum > 0) {
            result += verseMaker('w', wNum);
        }
        if (xNum + zNum == 0) {
            return result.substring(0, result.length() - 1);
        }
        if (xNum > 0) {
            result += verseMaker('x', xNum);
        }
        if (zNum == 0) {
            return result.substring(0, result.length() - 1);
        }
        if (zNum > 0) {
            result += verseMaker('z', zNum);
        }

        return result;
    }

    private String verseMaker(char letter, int num) {
        return letter != 'z' ? letter + String.format("  %-6d", num) + dotsMaker(num) + "\r" :
                letter + String.format("  %-6d", num) + dotsMaker(num);
    }

    private String dotsMaker(int in) {
        return IntStream.range(0, in)
                .mapToObj(x -> "*")
                .collect(Collectors.joining());
    }

    private int charNum(String word, char ch) {
        return word.replaceAll("[^" + ch + "]", "").length();
    }
}
