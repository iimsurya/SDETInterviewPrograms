package july2026;

public class LargestAndSmallestNumber {

    public static void main(String[] args) {

        int[] input = {2,3,4,31,6,1};

        if (input.length == 0 || input == null){
            System.out.println("Array is empty ot null");
        }

        int min = input[0];
        int max = input[0];

        for (int i = 0; i < input.length; i++) {

            if(input[i] > max){
                max =input[i];
            }
            if(input[i] < min){
                min = input[i];

            }
        }

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}
