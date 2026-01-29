package arrayPrograms;

public class NonRepeatingChar {

    public static void main(String[] args) {

        String input = "Swiss";
        String normalizedInput = input.toLowerCase();

        for (int i = 0; i < normalizedInput.length(); i++) {

            char c = normalizedInput.charAt(i);

            if(normalizedInput.indexOf(c) == normalizedInput.lastIndexOf(c)){

                System.out.println("First non repeating char is : " + normalizedInput.charAt(i));

                return;
            }
        }

        System.out.println("No non repeating char found");
    }
}
