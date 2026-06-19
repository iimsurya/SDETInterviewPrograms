package stringPrograms;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the input to check palindrome : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] inputToChars = input.toCharArray();
        //StringBuilder reversedStringBuild = new StringBuilder();
        String reversedString = "";

        for (int i = inputToChars.length-1; i>=0; i--){

            //without string builder
                reversedString = reversedString + inputToChars[i];

            //using StringBuilder
                //reversedString.append(String.valueOf(inputToChars[i]));
        }

        System.out.println("Reversed String : " + reversedString);

        //Check Palindrome
        if(input.equals(reversedString))
            System.out.println(input +" is Palindrome");
        else
            System.out.println(input + " is not a palindrome");
    }
}
