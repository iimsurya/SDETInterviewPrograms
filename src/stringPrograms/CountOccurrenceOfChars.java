package stringPrograms;

import java.util.Scanner;

public class CountOccurrenceOfChars {


    public static void main(String[] args) {

        System.out.println("Please enter the String : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] stringToChar = input.toCharArray();

        for (int i = 0; i < stringToChar.length; i++) {

            //check if the char is marked as 0
            if(stringToChar[i] == '0'){
                continue;
            }

            int count = 1;
            for (int j = i+1; j < stringToChar.length; j++) {

                if(stringToChar[i]==stringToChar[j]){

                     count++;
                     stringToChar[j] = '0';
                }

            }
            System.out.println(stringToChar[i] + " - " + count);
        }
    }

    public static class NonRepeatingChar {

        public static void main(String[] args) {

            String input = "Swiss";
            String normalizedInput = input.toLowerCase();

            for (int i = 0; i < normalizedInput.length(); i++) {

                char c = normalizedInput.charAt(i);

                if(normalizedInput.indexOf(c) == normalizedInput.lastIndexOf(c)){

                    System.out.println("First non repeating char is : " + normalizedInput.charAt(i));

                    return;
                }
            }

            System.out.println("No non repeating char found");
        }
    }
}
