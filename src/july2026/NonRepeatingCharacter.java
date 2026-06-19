package july2026;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "aabccb";

        input = input.toLowerCase().trim().replace(" ","");
        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            if(input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))){
                System.out.println("First non repeating char is: " + input.charAt(i));
                return;
            }
        }
        System.out.println("All chars are repeating");
    }
}
