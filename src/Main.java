import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two different numbers in the specified types. ");

        //Entering integer number
        System.out.println("Please enter the integer number: ");
        int first_number = scanner.nextInt();

        //Entering double number
        System.out.println("Please enter the decimal number: ");
        double second_number = scanner.nextDouble();

        //Converts integer to decimal
        double decimal_firstnumber = first_number;

        //Converts decimal to integer
        int integer_secondnumber = (int) second_number;

        //Showing result
        System.out.println("The integer number " + first_number + " is a decimal number now: " + decimal_firstnumber);
        System.out.println("The decimal number " + second_number + " is a integer number now: " + integer_secondnumber);


    }
}