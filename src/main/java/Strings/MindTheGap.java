package Strings;

public class MindTheGap {
    public int missingCarriages(String in){
        return (in.charAt(in.length() - 1) - 64) - in.length();
    }
}
