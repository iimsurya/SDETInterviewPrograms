package learnCollections;

import java.util.ArrayList;
import java.util.Comparator;

public class AListBasics {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("BMW");
        arrayList.add("Ferrari");
        arrayList.add("Honda");
        arrayList.add("Mercedes");
        arrayList.remove("Mercedes");
        arrayList.addFirst("TATA");

        System.out.println(arrayList);
    }
}
