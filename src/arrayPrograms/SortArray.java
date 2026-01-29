package arrayPrograms;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] input = {1,2,3,5,6,4,11,0,1};
        int temp;

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

    }
}
