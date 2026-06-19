package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {

        int[] input = {1,2,3,5,6,4,11,0,1};
        int temp;

        //Create temp , use two for loop to compare all the values. in If condition check if first number
        //is lesser than second numer, if yes update it using temp.
        for (int i = 0; i < input.length; i++) {

            for (int j = i+1; j < input.length; j++) {

                if(input[i]<input[j]){

                    temp=input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        Arrays.stream(input).forEach(System.out::println);
        // In reverse order (descending - largest to smallest)
        //Arrays.stream(input).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

        // Or in ascending order (smallest to largest)
        //Arrays.stream(input).sorted().forEach(System.out::println);

    }
}
