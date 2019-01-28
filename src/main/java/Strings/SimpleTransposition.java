package Strings;

public class SimpleTransposition {
    public String transposition(String text) {
        StringBuilder res = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                res.append(text.charAt(i));
            } else if (i % 2 != 0) {
                res2.append(text.charAt(i));
            }

        }
        return res.toString() + res2.toString();
    }
}
