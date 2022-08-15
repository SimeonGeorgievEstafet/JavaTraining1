public class ExceptionsTraining {

    public static void main(String[] args) {

        String nullable = null;

        try {
            System.out.println(nullable.length());
        } catch (Exception e) {
            System.out.println("I caught an exception !!!");
        } finally {
            System.out.println("You see this text because there is an exception !!!");
        }

        System.out.println("Have a good day! :) ");

    }
}