package arrayPrograms;

public class MissingNumber {

    public static void main(String[] args) {


        int[] input = {1,3,4,5};
        int n = 5;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;


        for(int num : input){

            actualSum = actualSum+num;
        }

        System.out.println("The missing number is : " + (expectedSum-actualSum));
    }
}
