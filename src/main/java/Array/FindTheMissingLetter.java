package Array;

public class FindTheMissingLetter {
    public  char findMissingLetter(char[] array) {
        char toCompare = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (toCompare + i != array[i]) {
                return (char)(toCompare + i);
            }
        }
        return toCompare;
    }
}
