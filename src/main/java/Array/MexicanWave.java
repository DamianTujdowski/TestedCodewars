package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public String[] waveCreator(String str) {
        String[] wordsArray = new String[str.length()];
        Arrays.fill(wordsArray, str);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < wordsArray.length; i++) {
            String[] lettersArray = wordsArray[i].split("");
            lettersArray[i] = lettersArray[i].toUpperCase();
            wordsArray[i] = String.join("", lettersArray);
            if (!lettersArray[i].equals(" ")) {
                result.add(wordsArray[i]);
            }
        }
        return result.stream().toArray(String[]::new);
    }
}
