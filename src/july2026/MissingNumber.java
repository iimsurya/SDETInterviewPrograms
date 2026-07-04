package july2026;

public class MissingNumber {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,6};
        int numbers = 6;
        int expectedTotal = numbers*(numbers+1)/2; //5(5+1)/2 = 15
        int actualSum = 0;

        for(int num : ints){
            actualSum = actualSum + num;
        }

        int missingNumber = expectedTotal - actualSum;
        System.out.println(missingNumber);
    }
}

