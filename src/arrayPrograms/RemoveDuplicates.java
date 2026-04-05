package arrayPrograms;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] input = {1,3,7,3,2,5,5,0,1};

        //Create arraylist, iterate values using for loop -> using ! arraylist.contains find the non duplicate numbers
        //and store them using .add in arraylist and print

        ArrayList<Integer> outputList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            if(!outputList.contains(input[i])){

                outputList.add(input[i]);
            }
        }
        System.out.println(outputList);

    }
}
