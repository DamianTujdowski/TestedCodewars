package Array;


import java.util.Arrays;

public class TheOffice {
    public String outed(Person[] meet, String boss) {
        long happines = Arrays.stream(meet)
                .map(x -> x.getName().equals(boss) ? x.getHappiness() * 2 : x.getHappiness())
                .count();
        return happines <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
