package learnCollections;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

    public static void main(String[] args) {

        int[] input = {1,2,4,5,3,4,1};
        Set<Integer> seen = new HashSet<>();

        for (int num : input){
            if(!seen.add(num)){
                System.out.println(num);
            }

        }
    }
}
