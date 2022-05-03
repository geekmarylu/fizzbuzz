import java.util.Scanner;

public class FizzBuzz {

    /**
     * Write code to print FizzBuzz,
     * If the value is divisible by 15,
     * write FizzBuzz
     * If the value is divisible by 3,
     * write Fizz
     * If the value is divisible by 5
     * write Buzz
     * Else
     * write the value
     **/

    public static void main(String[] args) {

        int intInputVal;
        System.out.println("Please may you enter the value you wish to run a FIZZBUZZ check on: ");

        //Instantiate input scanner object
        Scanner input = new Scanner(System.in);

        try {

            intInputVal = input.nextInt();

            String output = intInputVal % 5 == 0 ? printResult(intInputVal, 15, "FizzBuzz") : printResult(intInputVal, 3, "Fizz");
            if (!isNumeric(output))
                System.out.println(output);
            else
                System.out.println(intInputVal % 5 == 0 ? printResult(intInputVal, 5, "Buzz") : String.valueOf(intInputVal));


        } catch (Exception ex) {
            System.out.println("You must specify an integer value as user input.");
        }
    }


    /**
     * This is a generic method that will be reused to print the result of the boolean logic
     * The order of the boolean logic is written in the manner of the instruction given in the question
     **/
    private static String printResult(int value, int divisor, String result) {

        if (value % divisor == 0) {
            return result;
        } else
            return String.valueOf(value);
    }


    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
