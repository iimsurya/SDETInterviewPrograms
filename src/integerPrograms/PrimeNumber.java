package integerPrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        boolean isPrime = true;
        if(input>0) {
            for (int i = 2; i <= input / 2; i++) {

                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(input + " is a prime number");
            }else{
                System.out.println(input + " is not a prime number");
            }
        }else
            System.out.println("Enter valid number");
    }
}
