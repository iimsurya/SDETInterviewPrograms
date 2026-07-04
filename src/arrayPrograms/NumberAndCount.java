package arrayPrograms;

import java.util.ArrayList;

public class NumberAndCount {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,3,4,1};
        ArrayList<Integer> listOfInteger = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            int k =0;
            if(!listOfInteger.contains(input[i])) {

                listOfInteger.add(input[i]);
                k++;


                for (int j = i + 1; j < input.length; j++) {

                    if (input[i] == input[j]) {
                        k++;
                    }
                }

                System.out.println(input[i] + ":" + k);
            }
        }
    }
}
