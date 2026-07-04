package july2026;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharinString {

    public static void main(String[] args) {

        String input = "Programmer";

        char[] inputToChar = input.toCharArray();

        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < inputToChar.length; i++) {

            for (int j = i+1; j < inputToChar.length ; j++) {

                if(inputToChar[i]==inputToChar[j]){
                    //System.out.println(inputToChar[i]);
                    characterSet.add(inputToChar[i]);
                    break;
                }
            }
        }
        System.out.println(characterSet);
    }
}
