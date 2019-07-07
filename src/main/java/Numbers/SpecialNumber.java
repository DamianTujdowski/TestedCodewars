package Numbers;

public class SpecialNumber {
    public String isSpecial(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .anyMatch(x -> x == 6 || x == 7 || x == 8 || x == 9) ? "NOT!!" : "Special!!";
    }
}
