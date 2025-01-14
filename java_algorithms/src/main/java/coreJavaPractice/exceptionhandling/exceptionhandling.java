package coreJavaPractice.exceptionhandling;

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int no = 2 / 0;
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
            throw ae;
        }
        finally {
            System.out.println("finally block");
        }

        System.out.println("completed execution");
    }
}
