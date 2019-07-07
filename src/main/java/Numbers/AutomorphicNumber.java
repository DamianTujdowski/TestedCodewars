package Numbers;

public class AutomorphicNumber {
    public String isAutomorphic(int number) {
        String numberStr = String.valueOf(number);
        String square = String.valueOf(number * number);
        String lastDigits = square.substring(square.length() - numberStr.length());
        return numberStr.equals(lastDigits) ? "Automorphic" : "Not!!";
    }
}
