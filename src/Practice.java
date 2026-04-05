import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        String input = "abcdedc";

        char[] inputChars = input.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            int count = 0;
            if(!arrayList.contains(inputChars[i])){

                arrayList.add(inputChars[i]);
                count++;

                for (int j = i+1; j < input.length(); j++) {

                    if (inputChars[i] == inputChars[j]) {

                        count++;
                    }
            }

                System.out.println(inputChars[i] + " : " + count);
            }
        }

    }
}
