package PatternMatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

//    5. Validate an email (basic)
//    Write a regex (not perfect RFC-compliant, just reasonable) that validates:
//    local-part@domain.tld. Test against:
//
//    john.doe@example.com ✓
//    jane@sub.example.co.in ✓
//    not-an-email ✗
//    @missing-local.com ✗

//    Why this works for your test cases:
//            ^ and $ anchor the match to the entire string (so matches() behaves like a full-string check, which find() alone wouldn't guarantee).
//            [\w.+-]+ — local part allows letters, digits, underscore, dots, plus, hyphen (covers john.doe).
//            @ — literal.
//            [\w-]+(\.[\w-]+)+ — domain requires at least one label, followed by one or more .label groups. This is the key part: it forces at least one dot after the @, so:
//
//    example.com → matches (example + .com)
//    sub.example.co.in → matches (sub, .example, .co, .in)
//    not-an-email → no @, fails
//    @missing-local.com → empty local part before @, fails (+ requires at least one char)

    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine();

        Pattern pattern = Pattern.compile("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println(input + " is valid email");
        }else{
            System.out.println(input + " is invalid email");
        }


    }
}
