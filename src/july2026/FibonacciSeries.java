package july2026;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 7;

        int numberOne = 0;
        int numberTwo = 1;
        int result = 0;

        for (int i = 1; i <=n ; i++) {

            System.out.println(result);
            result = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = result;
        }
    }
}
