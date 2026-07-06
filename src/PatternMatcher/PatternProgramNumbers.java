package PatternMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProgramNumbers {

    public static void main(String[] args) {

        String input = "I have 5 apples, 12 oranges, and 100 bananas";
        List<String> counts = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            counts.add(matcher.group());
        }

        System.out.println(counts);
    }
}
