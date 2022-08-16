package Exceptions;

public class TryWithMultipleExceptionsTraining {


    public static void main(String[] args) {

        String[] arrayOfWords = {"test", null};

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(arrayOfWords[i].toString());
            } catch (NullPointerException | IndexOutOfBoundsException ex) {
                System.out.println("I caught an: " + ex);
            }
        }
    }
}