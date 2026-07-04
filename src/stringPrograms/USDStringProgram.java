package stringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USDStringProgram {

    public static void main(String[] args) {

        String text  = "100Surya200Automation300";

        // Method 1  -
        Pattern numbePattern = Pattern.compile("\\d+");
        Matcher matcher = numbePattern.matcher(text);

        int total = 0;

        while (matcher.find()){
            total = total + Integer.parseInt(matcher.group());
        }

        System.out.println(total);

        // Method 2 - Solved using Stream
        int streamTotal = Pattern.compile("\\d+").matcher(text).results()
                .mapToInt(m -> Integer.parseInt(m.group())).sum();

        System.out.println("Output using stream: " + streamTotal);
    }
}
