package july2026;

public class ReverseANumber {

    public static void main(String[] args) {

        int number = 57382;
        int reminder;
        //int newNum;
        int result = 0;

        while (number>0) {
            reminder = number % 10;
            number = number / 10;
            result = (result * 10) + reminder;

        }

        System.out.println(result);
    }


}
