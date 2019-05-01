package Numbers;

import java.util.Arrays;

public class CreditCardValidation {
    public boolean creditCardValidator(String n) {
        int[] numberDigits = n.chars().map(x -> x - '0').toArray();

        for (int i = numberDigits.length % 2 == 0 ? 0 : 1; i < numberDigits.length; i += 2) {
            numberDigits[i] *= 2;
            if (numberDigits[i] > 9) {
                numberDigits[i] -= 9;
            }
        }

        return Arrays.stream(numberDigits).sum() % 10 == 0;
    }
}
