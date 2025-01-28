package coreJavaPractice.exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exceptionhandling3 {
    public static void main(String[] args) throws loginexception {
        try {
            String username = "arav";
            int sum = 2/0;
        } catch (ArithmeticException lo) {
            throw  new loginexception("login failed, please retry");
        }

    }
}
