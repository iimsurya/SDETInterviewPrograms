package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProgramOne {

//    Problem 1: Find the Sum (Easy)
//    text = "Apple50Mango75Banana100Orange25"
//    Extract all numbers and find their sum.
//    Expected Output: 250

    public static void main(String[] args) {

        String text = "Apple50Mango75Banana100Orange25";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        int total = 0;

        while (matcher.find()){
            total = total + Integer.parseInt(matcher.group());
        }

        System.out.println(total);
    }
}
