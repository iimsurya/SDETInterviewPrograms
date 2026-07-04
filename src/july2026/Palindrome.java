package july2026;

public class Palindrome {



    public static void main(String[] args) {
        String input = "Racecard";

        String loweredString = input.toLowerCase();
        char[] inputToChar = loweredString.toCharArray();
        String reversedString = "";

        for(int i = inputToChar.length-1; i>=0; i-- ){

            reversedString= reversedString+ inputToChar[i];
        }

        if(loweredString.equals(reversedString)){
            System.out.println("Given input is palindrome string");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
