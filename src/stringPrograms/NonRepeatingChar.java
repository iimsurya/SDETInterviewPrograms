package stringPrograms;

public class NonRepeatingChar {

    public static void main(String[] args) {


        String input = "google";

        if(input == null || input == ""){
            System.out.println("Give valid input");
        }
        String inputNormalized = input.toLowerCase().replace(" ", "");

        for (int i = 0; i < inputNormalized.length(); i++) {

            if(inputNormalized.indexOf(inputNormalized.charAt(i)) ==
                    inputNormalized.lastIndexOf(inputNormalized.charAt(i)))
            {
                System.out.println("First non repeating char in given string is :" + inputNormalized.charAt(i));
                return;
            }

        }
        System.out.println("No non repeating char in given string");

    }
}
