package learnCollections;

import java.util.*;

public class AListIntermediate {

//	Remove Duplicates — Given a List with duplicate integers, remove all duplicates and print the unique elements (without using Set).
//	Reverse a List — Reverse a List of strings without using Collections.reverse().
//	Sort Custom Objects — Create a List of Student objects (name, age). Sort them by age using Comparator.
//	Sublist — Given a list of 10 numbers, extract elements from index 3 to 7 using subList() and print them.
//	Merge Two Lists — Merge two ArrayLists into one, sort it, and remove duplicates.
//	Frequency Count — Given a list of strings, count how many times each word appears using only List methods.

	public static void removeDuplicates(){

		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 4));

		LinkedList<Integer> list2 = new LinkedList<>();

		for(int num : list){

			if(!list2.contains(num)){
				list2.add(num);
			}
		}

		System.out.println(list2);
	}

	public static void reverseList(){
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 4));

		Collections.reverse(list);
		System.out.println(list);
	}


	public static void main(String[] args) {

		//removeDuplicates();
		reverseList();
	}

}

