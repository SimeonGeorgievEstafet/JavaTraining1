import Exceptions.MathException;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Demo2 {


    public static void main(String[] args) throws MathException {

        Math calculator = new Math();
        String a, b;
        double c;

        int intValueOfA, intValueOfB;


        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter first digit:");
            a = sc.nextLine();
            System.out.println("Please enter second digit:");
            b = sc.nextLine();
            try {
                intValueOfA = Integer.parseInt(a);
                intValueOfB = Integer.parseInt(b);

            } catch (NumberFormatException e) {
                throw new MathException("Input String cannot be parsed to Integer.");
            }

            c = calculator.divideTwoIntegers(intValueOfA, intValueOfB);

        } catch (ArithmeticException ex) {
            throw new MathException("Divide by 0 is forbidden!");
        }

        System.out.println("The result of division is: " + c);
    }

}
