package arrayPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    // This program removes duplicate numbers from an array while keeping the first occurrence order intact.
    public static void main(String[] args) {

        int[] input = {1,3,7,3,2,5,5,0,1};


        LinkedHashSet<Integer> outputSet = new LinkedHashSet<>();

        for (int j : input) {

            outputSet.add(j);
        }
        System.out.println(outputSet);

    }
}
