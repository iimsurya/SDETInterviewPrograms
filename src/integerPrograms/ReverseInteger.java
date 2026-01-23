package integerPrograms;

import java.util.Optional;
import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int reminderAKALastChar;
        int sumAKANewBuild = 0;

        int tempStorageToSaveOriginalValue = input;

        while(input>0){

            reminderAKALastChar = input%10;
            input = input/10;
            
            sumAKANewBuild = (sumAKANewBuild * 10) + reminderAKALastChar;
            
        }

        if(sumAKANewBuild==tempStorageToSaveOriginalValue)
            System.out.println(tempStorageToSaveOriginalValue + " is palindrome integer");
        else
            System.out.println(tempStorageToSaveOriginalValue + " is not a palindrome integer");

    }
}
