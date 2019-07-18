package Strings;

public class ExesAndOhs {
    public boolean xAndONumberIsEqual(String str){
        String truncated = str.toLowerCase().replaceAll("[^ox]*", "");
        return truncated.replaceAll("[^x]","").length() == (double)truncated.length() / 2;
    }
}
