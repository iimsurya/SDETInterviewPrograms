package integerPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number : ");
        int numberOne = scanner.nextInt();
        System.out.println("Second Number : ");
        int numberTwo = scanner.nextInt();

         numberOne = numberTwo + numberOne; //2+1 = 3
         numberTwo =  numberOne - numberTwo; //3-2 = 1
         numberOne = numberOne - numberTwo; //2-1 = 2

        System.out.println("Swapped First number : " + numberOne +
                " Swapped Second number : " + numberTwo);

    }
}
