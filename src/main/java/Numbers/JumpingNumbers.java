package Numbers;

public class JumpingNumbers {
    public String isJumping(int number) {
        int[] digits = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        if(digits.length == 1) return "Jumping!!";

        for (int i = 0; i < digits.length - 1; i++) {
            if (Math.abs(digits[i] - digits[i + 1]) != 1) return "Not!!";
        }
        return "Jumping!!";
    }
}
