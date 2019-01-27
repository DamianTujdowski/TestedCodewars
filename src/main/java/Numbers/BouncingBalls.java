package Numbers;

public class BouncingBalls {
    public int bounces(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int bounces = 1;
        while (h > window) {
            h *= bounce;
            bounces += 2;
        }
        return bounces - 2;
    }
}
