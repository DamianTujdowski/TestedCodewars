package Numbers;

public class SumOfOddNumbers {
    public int rowSumOddNumbers(int n) {
        int numbersBeforeNthRow = (int) ((double) n / 2 * (n - 1));
        int firstNumberInNthRow = 1 + numbersBeforeNthRow * 2;
        int lastNumberInNthRow = (numbersBeforeNthRow + n) * 2 - 1;
        return (int) ((double) (firstNumberInNthRow + lastNumberInNthRow) / 2 * n);
    }
}
