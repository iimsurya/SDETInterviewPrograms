package stringPrograms;

import java.util.Scanner;

public class RemoveDuplicateChars {

    public static void main(String[] args) {

        System.out.println("Please enter the input to remove duplicates : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String duplicateRemovedString = "";

        for (int i = 0; i < input.length(); i++) {

            char charAtIndex = input.charAt(i);

            if (duplicateRemovedString.indexOf(charAtIndex) == -1){
                duplicateRemovedString += charAtIndex;
            }

        }
            System.out.println(duplicateRemovedString);
    }
}
