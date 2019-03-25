package Numbers;

public class SuitcasePacking {
    public boolean fitIn(int a, int b, int m, int n) {
        return a * a + b * b <= m * n
                && m >= a && m >= b
                && n >= a && n >= b;
    }
}
