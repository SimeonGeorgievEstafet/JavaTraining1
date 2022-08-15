import Exceptions.MathException;

import java.util.Scanner;

public class Demo {


    public static void main(String[] args) throws MathException {

        Math calculator = new Math();
        Scanner sc = new Scanner(System.in);
        String a, b;
        int intValueOfA, intValueOfB;


        try {
            System.out.println("Please enter first digit:");
            a = sc.nextLine();
            try {
                intValueOfA = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                throw new MathException("Input String cannot be parsed to Integer.");
            }

            System.out.println("Please enter second digit:");
            b = sc.nextLine();
            try {
                intValueOfB = Integer.parseInt(b);
            } catch (NumberFormatException e) {
                throw new MathException("Input String cannot be parsed to Integer." );
            }

        } catch (ArithmeticException e) {
            throw new MathException("Invalid operation");
        }

        System.out.println("The result of division is: " + calculator.divideTwoIntegers(intValueOfA, intValueOfB));
    }

}
