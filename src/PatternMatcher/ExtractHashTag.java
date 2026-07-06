package PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHashTag {

//    4. Extract hashtags
//    From "Loving #java and #RegexPatterns but not #java_is_hard!",
//    extract all hashtags without the # symbol.

    public static void main(String[] args) {

        String input = "Loving #java and #RegexPatterns but not #java_is_hard!";

        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
