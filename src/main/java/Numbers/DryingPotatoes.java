package Numbers;

public class DryingPotatoes {
    public int potaotes(int p0, int w0, int p1) {
//        double dryMatter = w0 - (p0 / 100.0 * w0);
//        double percentAfterDrying = 100.0 / (100 - p1);
//        return (int) Math.round(dryMatter * percentAfterDrying);
        return (int) Math.round((w0 - p0 / 100.0 * w0) * (100.0 / (100 - p1)));
    }
}
