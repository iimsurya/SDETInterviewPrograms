package arrayPrograms;


public class LargestAndSmallestNumber {

    public static void main(String[] args) {


        int[] input = {10,3,2,9,8,2,11,10};

        if (input.length == 0) {
            System.out.println("Array is Empty");
            return;
        }

        //Create two variable and assign 0 index value, then iterate using for loop and write an if condition
        //to check if iterated value is greater than or less than max and min. if it is greater than max
        //assign that value to max, if it is lesser than min assign that value to min.

        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {

            //for (int j = i+1; j <input.length ; j++) {

            if (min > input[i])
                min = input[i];
            if (max < input[i])
                max = input[i];
            //}
        }

        System.out.println(min);
        System.out.println(max);
    }


}
