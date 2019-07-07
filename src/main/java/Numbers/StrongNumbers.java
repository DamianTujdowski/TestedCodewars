package Numbers;

public class StrongNumbers {
    public String isStrong(int num) {
        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .map(this::factorial)
                .sum() == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return factorial(num - 1) * num;
    }
}
