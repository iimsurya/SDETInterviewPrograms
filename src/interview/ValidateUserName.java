package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {

//    2. Validate a username
//    Write a regex that only allows usernames with 3–16 characters, letters/digits/underscore only.
//    Test it against: "john_doe", "jo", "this_is_way_too_long_123", "john doe".

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\w{3,16}$");
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
}
