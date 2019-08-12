package Numbers;

public class Primorial {
    public int primorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return primorial(x - 1) * x;
    }

    public boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;

        if (x % 2 == 0 || x % 3 == 0) return false;

        for (int i = 5; i * i <= x; i = i + 6) {
            if (x % i == 0 || x % (i + 2) == 0) return false;
        }
        return true;
    }
}
