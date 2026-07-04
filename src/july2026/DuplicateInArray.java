package july2026;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,1,2,6,2};

        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();

        for (int num : ints){
            if(!arrayList.contains(num)){
                arrayList.add(num);
            }else {
                integerSet.add(num);
            }
        }

        System.out.println("Duplicate removed: "+ arrayList);
        System.out.println("Duplicates are: " + integerSet);
    }
}
