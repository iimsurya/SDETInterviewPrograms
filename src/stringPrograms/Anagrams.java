package stringPrograms;

public class Anagrams {

    public static void main(String[] args) {

        String wordOne = "sky to in";
        String wordTwo = "kys into";

        if(wordOne == null || wordTwo == null){
            System.out.println("Empty String");
            return;
        }
        
        wordOne = wordOne.toLowerCase().replace(" ", "");
        wordTwo = wordTwo.toLowerCase().replace(" ","");
        
        if(wordOne.length() != wordTwo.length()){
            System.out.println("It is not anagram - world lengths are not matching");
            return;
        }
        
        int [] count = new int[26];

        for (int i = 0; i < wordTwo.length(); i++) {

            count[wordOne.charAt(i) - 'a']++;
            count[wordTwo.charAt(i) - 'a']--;
        }

        for(int c : count){

            if(c != 0){
                System.out.println("Given inputs are not anagrams");
                return;
            }
        }
        
        System.out.println("Inputs are anagram");

    }
}
