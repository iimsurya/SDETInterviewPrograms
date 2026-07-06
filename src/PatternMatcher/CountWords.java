package PatternMatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

//    3. Count words
//    Given a sentence with irregular spacing ("Hello    world,   how   are you"),
//    count how many words it contains using \S+ tokens.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(input);
        int count = 0;

        while (matcher.find()){

             count++;
        }

        System.out.println(count);
    }
}
