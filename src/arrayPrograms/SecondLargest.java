package arrayPrograms;

public class SecondLargest {

    public static void main(String[] args) {

        int[] input = {10,2,11,2,3,5,6,1};


        if(input == null || input.length <2){
            System.out.println("Input length is too short");
            return;
        }

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
