package stringPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Please provide the input string to reverse : ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();

                //Reversing the sting by converting it to char array and printing in reverse order

        char[] inputChar = input.toCharArray();

        for (int i = inputChar.length-1; i>=0; i--){

            System.out.print(inputChar[i]);

        }

    }
}
