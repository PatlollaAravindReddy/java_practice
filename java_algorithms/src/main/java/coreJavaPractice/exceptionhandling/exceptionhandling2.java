package coreJavaPractice.exceptionhandling;

import java.io.*;

public class exceptionhandling2 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\Users\\19049\\Videos\\Testing\\resumeoutput.txt");
        if(f1.exists()) {
            f1.delete();
        }
        String aa = "Hello";
        try(FileWriter fw = new FileWriter(f1)) {
            fw.write(aa);
            //int sum = 2/0;
            int[] data = {};
            System.out.println(data[1]);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException | IOException io) {
            System.out.println("Common Exception");
            System.exit(0);
        } finally {
            System.out.println("Finally block");
        }

    }
}
