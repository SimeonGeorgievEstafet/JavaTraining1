import Exceptions.MathException;

public class Demo3 {


    public static void main(String[] args) throws MathException {

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