package stringPrograms;

public class Split {

    public static void main(String[] args) {

        String test = "Abc123!@#XyZ 9";

        StringBuilder upperCase = new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        StringBuilder space = new StringBuilder();

        char[] inputAsChar = test.toCharArray();

        for(char c : inputAsChar){

            if(Character.isUpperCase(c)){
                upperCase.append(c);
            } else if (Character.isLowerCase(c)) {
                lowerCase.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            } else if(Character.isSpaceChar(c)) {
                space.append(c);
            }else {
                specialChars.append(c);
            }
        }

        System.out.println("Characters are: "+ upperCase + " - " + "Count: " + upperCase.length());
        System.out.println("Characters are: "+ lowerCase + " - " + "Count: " + lowerCase.length());
        System.out.println("Characters are: "+ numbers + " - " + "Count: " + numbers.length());
        System.out.println("Characters are: "+ space + " - " + "Count: " + space.length());
        System.out.println("Characters are: "+ specialChars + " - " + "Count: " + specialChars.length());


    }


}
