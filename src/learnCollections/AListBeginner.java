package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AListBeginner {

//    Basic Operations — Create a List of 5 student names. Add, remove, and retrieve elements by index. Print the final list.
//    List Traversal — Given a list of integers, print all elements using a for loop, enhanced for loop, and Iterator.
//    Search in List — Given a list of strings, check if a given element exists using contains() and find its index using indexOf().
//    List to Array — Create an ArrayList of 5 numbers, convert it to an array, and print both.

    public static void basicOperations(){

        List<String> list = new ArrayList<>();

        list.add("Senthil");
        list.add("Guna");
        list.add("Velu");
        list.add("Thambi");
        list.add("Anbu");

        System.out.println(list);
        list.add(0, "Raajan");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(4));

    }

    public static void listTraversal(){

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        for(int i =0; i<list.size(); i++){

            System.out.println(list.get(i));
        }

        for(int i : list){
            System.out.println(i);
        }

        list.iterator().forEachRemaining(System.out::println);
    }

    public static void searchList(){

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Mercedes", "Guna", "Thambi", "Anbu"));


            if(list.contains("Guna"))
                System.out.println(list.indexOf("Guna"));
            else
                System.out.println("Not found");
    }

    public static void AlistToArray(){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int[] intArray = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            intArray[i] = list.get(i);
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {

        //basicOperations();
        //listTraversal();
        //searchList();
        AlistToArray();

    }
}
