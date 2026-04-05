package arrayPrograms;

public class SecondLargest {

    public static void main(String[] args) {

        int[] input = {10,2,11,2,3,5,6,1};


        if(input == null || input.length <2){
            System.out.println("Input length is too short");
            return;
        }

        //create two variables "largest" and "secondlargest" assign them Integer.MIN_Value, iterate using for each loop -> write
        //if condition to check num > largest -> assign largest value to second largest and num to largest
        //in else if write a condition to check if the number is smaller than largest and larger than second largest
        //assign them to second largest

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : input){

            if(largest<num){

                secondLargest = largest;
                largest = num;
            }else if (num < largest && num > secondLargest){
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
