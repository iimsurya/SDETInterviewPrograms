package stringPrograms;

public class Anagrams {

    public static void main(String[] args) {

        String wordOne = "sky to in";
        String wordTwo = "kys into";

        // Step 1: Check if either string is null to avoid NullPointerException
        if(wordOne == null || wordTwo == null){
            System.out.println("Empty String");
            return;
        }
        
        // Step 2: Convert both strings to lowercase and remove spaces for comparison
        wordOne = wordOne.toLowerCase().replace(" ", "");
        wordTwo = wordTwo.toLowerCase().replace(" ","");
        
        // Step 3: Check if both strings have the same length (anagrams must have equal length)
        if(wordOne.length() != wordTwo.length()){
            System.out.println("It is not anagram - world lengths are not matching");
            return;
        }
        
        // Step 4: Create an array to store character frequencies (26 for a-z)
        int [] count = new int[26];

        // Step 5: Increment count for characters in wordOne and decrement for wordTwo
        // If both are anagrams, all positions should end up as 0
        for (int i = 0; i < wordTwo.length(); i++) {

            count[wordOne.charAt(i) - 'a']++;
            count[wordTwo.charAt(i) - 'a']--;
        }

        // Step 6: Verify that all character counts are 0 (meaning both strings have same characters)
        for(int c : count){

            if(c != 0){
                System.out.println("Given inputs are not anagrams");
                return;
            }
        }
        
        // Step 7: If all checks pass, strings are anagrams
        System.out.println("Inputs are anagram");

    }
}
