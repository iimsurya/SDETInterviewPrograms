import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestArea {


    public static void main(String[] args) {


        String string1 = "listen";
        String string2 = "silent";


        if (string1 == null || string2 == null) {
            System.out.println("One of the input is null");
            return;
        }

        string1 = string1.replace(" ", "");
        string2 = string2.replace(" ", "");

        if (string1.length() != string2.length()) {
            System.out.println("Nor an Anagram - length");
            return;
        }

        int[] c = new int[26];

        for(int i = 0; i<string1.length(); i++){

            c[string1.charAt(i) - 'a']++;
            c[string2.charAt(i) - 'a']--;
        }

        for (int count : c){
            if(count != 0){
                System.out.println("Not an anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }

}
