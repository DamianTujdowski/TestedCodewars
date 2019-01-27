package Numbers;

public class Collatz {
    public String collatz(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        while (n > 1) {
            builder.append("->");
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            builder.append(n);
        }
        return builder.toString();
    }
}
