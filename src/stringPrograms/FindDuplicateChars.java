package stringPrograms;

import java.util.Scanner;


public class FindDuplicateChars {

    public static void main(String[] args) {

        System.out.println("Please enter the input string to find duplicate chars");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] inputToChar = input.toCharArray();

        for (int i = 0; i < inputToChar.length; i++) {

            for (int j = i+1; j < inputToChar.length; j++) {

                if(inputToChar[i] == inputToChar[j])
                    System.out.println(inputToChar[i]);
                break;
            }


        }

    }
}
