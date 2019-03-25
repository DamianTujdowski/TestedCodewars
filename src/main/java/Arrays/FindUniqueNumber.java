package Arrays;

import java.util.Arrays;
import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindUniqueNumber {

    public static Double findDistinctNumberInArray(double[] arr) {
        double result = 0;
        Map<Double, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(groupingBy(Double::doubleValue, counting()));

        for (Map.Entry<Double, Long> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
