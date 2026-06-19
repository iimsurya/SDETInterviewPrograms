package july2026;

public class ReverseString {

    public static void main(String[] args) {

        String input = "Surya";
        String reversed = "";

        char[] inputCharArray = input.toCharArray();

        for (int i = inputCharArray.length-1; i >=0; i--) {

            reversed= reversed + inputCharArray[i];
        }
        System.out.println(reversed);

        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed using String builder : " + sb.reverse());
    }
}
