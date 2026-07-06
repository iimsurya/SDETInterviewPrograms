package PatternMatcher;

import java.util.regex.Pattern;

public class FindSumOfIntegers {

//    Problem 2: Find the Product (Easy)
//    text = "Price2Dollar5Amount10Cost3"
//    Extract all numbers and multiply them.
//    Expected Output: 300

    public static void main(String[] args) {

        String text = "Price2Dollar5Amount10Cost3";

        int output = Pattern.compile("\\d+").matcher(text).results()
                .mapToInt(m -> Integer.parseInt(m.group())).reduce(1, (a,b) -> a * b );

        System.out.println(output);

    }
}
