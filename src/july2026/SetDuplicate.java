package july2026;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class SetDuplicate {

    public static void main(String[] args) {

        int[] input = {1,4,2,2,5,1,4,1,5,6,10,6,7,8};

        Set<Integer> result = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : input){
            if(!result.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println(result);
        System.out.println(duplicates);
    }
}
