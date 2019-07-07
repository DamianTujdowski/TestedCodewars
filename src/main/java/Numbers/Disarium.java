package Numbers;

public class Disarium {
    public String disariumNumber(int number) {
        int[] power = {2};
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .reduce((x, y) -> x + (int) Math.pow(y, power[0]++))
                .getAsInt() == number ? "Disarium !!" : "Not !!";
    }

}
