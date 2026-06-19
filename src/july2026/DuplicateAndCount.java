package july2026;

import java.util.ArrayList;

public class DuplicateAndCount {

    public static void main(String[] args) {

        int[] input = {1,2,6,4,5,1,2,3,1,5,78,8,6};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int k = 0;
            if(!arrayList.contains(input[i])){
                arrayList.add(input[i]);
                k++;

                for (int j = i+1; j < input.length; j++) {

                    if (input[i]==input[j]){
                        k++;
                    }
                }
                System.out.println("Number: " + input[i] +" - "+  "Count: " + k);
            }


        }
    }
}
