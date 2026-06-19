package july2026;

public class Anagram {

    public static void main(String[] args) {

        String wordOne = "sky to in";
        String wordTwo = "kys into";

        if(wordOne == null || wordTwo == null){
             System.out.println("Not Anagram - One or both input null");
            return;
        }

        String newWordOne = wordOne.trim().replace(" ", "");
        String newWordTwo = wordTwo.trim().replace(" ","");

        if(newWordOne.length() != newWordTwo.length()){
            System.out.println("Not Anagram - length is not matching");
            return;
        }

        int count[] = new int[26];

        for(int i = 0; i<newWordTwo.length();i++){

            count[newWordOne.charAt(i) - 'a']++;
            count[newWordTwo.charAt(i) - 'a']--;
        }

        for (int c : count){
            if(c != 0){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
