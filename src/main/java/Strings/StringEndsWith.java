package Strings;

public class StringEndsWith {
    public boolean solution(String str, String ending) {
        return str.length() < ending.length() ? false : str.substring(str.length() - ending.length()).equals(ending);
    }
}
