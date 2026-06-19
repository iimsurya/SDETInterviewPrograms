package july2026;

public class SecondLargestInArray {

    public static void main(String[] args) {

        int[] input = {11,2,3,4,5,4,2,6,5,11};

        if(input.length ==  0 || input == null){
            System.out.println("Input is empty or null");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {

            if(largest < input[i]){

                secondLargest = largest;
                largest = input[i];
            }
            if(secondLargest < input[i] && input[i] < largest){
                secondLargest= input[i];
            }

        }
        System.out.println(secondLargest);
    }
}
