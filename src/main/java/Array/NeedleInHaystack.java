package Array;

import java.util.stream.IntStream;

public class NeedleInHaystack {
    public String findNeedle(Object[] haystack) {
        return "found the needle at position " + IntStream.range(0, haystack.length)
                .filter(x -> haystack[x] != null && haystack[x].equals("needle"))
                .findFirst()
                .getAsInt();
    }

}
