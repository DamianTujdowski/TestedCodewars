package Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparingArrays {
    public boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }
        List<Integer> list = Stream.of(a)
                .flatMapToInt(Arrays::stream)
                .map(x -> x * x)
                .boxed()
                .collect(Collectors.toList());

//        List<Integer> compList = Stream.of(b)
//                .flatMapToInt(Arrays::stream)
//                .boxed()
//                .collect(Collectors.toList());
//
//        return compList.containsAll(list) && list.containsAll(compList);

        return Stream.of(b)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .allMatch(list::contains);
    }
}
