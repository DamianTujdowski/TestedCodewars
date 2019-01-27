package Strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DNAtoRNA {
    public String dnaToRna(String dna) {
        return IntStream.range(0, dna.length())
                .mapToObj(x -> dna.charAt(x) == 'U' ? 'T' : dna.charAt(x))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
