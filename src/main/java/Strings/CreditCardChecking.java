package Strings;

public class CreditCardChecking {
    public String getIssuer(String cardNumber) {
        if (cardNumber.substring(0, 2).equals("34") || cardNumber.substring(0, 2).equals("37") && cardNumber.length() == 15) {
            return "AMEX";
        } else if (cardNumber.substring(0, 4).equals("6011") && cardNumber.length() == 16) {
            return "Discover";
        } else if (cardNumber.substring(0, 2).equals("51") || cardNumber.substring(0, 2).equals("52")
                || cardNumber.substring(0, 2).equals("53") || cardNumber.substring(0, 2).equals("54")
                || cardNumber.substring(0, 2).equals("55") && cardNumber.length() == 16) {
            return "Mastercard";
        } else if (cardNumber.substring(0, 1).equals("4") && cardNumber.length() == 13
                || cardNumber.substring(0, 1).equals("4") && cardNumber.length() == 16) {
            return "VISA";
        } else {
            return "Unknown";
        }
    }
}
