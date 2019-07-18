package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Welcome {
    public String greet(String language) {

        Map<String, String> welcomeWords = new HashMap<>();
        welcomeWords.put("czech", "Vitejte");
        welcomeWords.put("danish", "Velkomst");
        welcomeWords.put("dutch", "Welkom");
        welcomeWords.put("estonian", "Tere tulemast");
        welcomeWords.put("finnish", "Tervetuloa");
        welcomeWords.put("flemish", "Welgekomen");
        welcomeWords.put("french", "Bienvenue");
        welcomeWords.put("german", "Willkommen");
        welcomeWords.put("irish", "Failte");
        welcomeWords.put("italian", "Benvenuto");
        welcomeWords.put("latvian", "Gaidits");
        welcomeWords.put("lithuanian", "Laukiamas");
        welcomeWords.put("polish", "Witamy");
        welcomeWords.put("spanish", "Bienvenido");
        welcomeWords.put("swedish", "Valkommen");
        welcomeWords.put("welsh", "Croeso");

        if (welcomeWords.containsKey(language)) {
            return welcomeWords.entrySet().stream()
                    .filter(x -> x.getKey().equals(language))
                    .map(Map.Entry::getValue)
                    .collect(Collectors.joining());
        }
        return "Welcome";
    }
}


