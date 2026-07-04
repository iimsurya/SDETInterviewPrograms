package july2026;

public class PrimeNumber {

    public static void main(String[] args) {

        Integer input = 5;

        if(input == 0 || input == null){
            System.out.println("Input is 0 or null");
            return;
        }
        for (int i = 2; i < input/2; i++) {

            if(input%i==0){
                System.out.println("Given number is not prime number");
                return;
            }

        }
        System.out.println( input + " is a primenumber.");
    }
}
