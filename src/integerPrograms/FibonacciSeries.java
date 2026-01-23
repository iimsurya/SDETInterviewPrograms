package integerPrograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int fibonacciOne = 0;
        int fibonacciTwo = 1;
        int result = 0;

        for (int i = 1; i <= input; i++) {

            System.out.println(result);
            result = fibonacciOne + fibonacciTwo;
            fibonacciOne = fibonacciTwo;
            fibonacciTwo = result;
        }

    }
}
